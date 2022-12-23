package controllers;

import java.sql.*;
import java.util.ArrayList;
import models.Paciente;
import services.BancoDados;
import services.Receber;

public class PacienteController {

    public static Paciente cadastrar() {
        Paciente p = new Paciente();
        System.out.println("\nCADASTRAR PACIENTE\n");

        System.out.print("Informe o Nome: ");
        p.setNome(Receber.texto());

        System.out.print("Informe a Data de Nascimento: ");
        p.setNascimento(Receber.data());

        System.out.print("Informe o CPF: ");
        p.setCpf(Receber.cpf());

        System.out.print("Informe o Celular: ");
        p.setTelefone(Receber.telefone());

        System.out.print("Informe o Email: ");
        p.setEmail(Receber.texto());
        return p;
    }

    public static void addPaciente(Paciente p) {
        Connection conn = BancoDados.conectar();

        try {
            String sql = "INSERT INTO paciente (nascimento,cpf,telefone,email,nome) VALUES (?,?,?,?,?)";

            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, p.getNascimento().toString());
            statement.setString(2, p.getCpf());
            statement.setString(3, p.getTelefone());
            statement.setString(4, p.getEmail());
            statement.setString(5, p.getNome());

            if (statement.executeUpdate() > 0) {
                System.out.println("\n--------------------------------");
                System.out.println("Paciente Cadastrado com Sucesso!!!");
                System.out.println("--------------------------------\n");
            } else {
                System.err.println("\n------------------------------");
                System.err.println("Falha ao Cadastrar o Paciente!!!");
                System.err.println("------------------------------\n");
            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        BancoDados.fecha(conn);
    }

    public static ArrayList<Paciente> getAll() {
        ArrayList<Paciente> lista = new ArrayList<>();
        Connection conn = BancoDados.conectar();

        try {
            String sql = "SELECT * FROM paciente";
            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                lista.add(new Paciente(
                        resultado.getDate("nascimento").toLocalDate(),
                        resultado.getString("cpf"),
                        resultado.getString("telefone"),
                        resultado.getString("email"),
                        resultado.getInt("id"),
                        resultado.getString("nome")
                ));

            }

        } catch (SQLException e) {
            System.out.println("ERRO AO BUSCAR: " + e);
        }

        BancoDados.fecha(conn);

        return lista;
    }

    public static ArrayList<Paciente> getNome(String nome) {
        ArrayList<Paciente> lista = new ArrayList<>();
        Connection conn = BancoDados.conectar();

        try {
            String sql = "SELECT * FROM paciente Where nome LIKE '%" + nome + "%'";
            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                lista.add(new Paciente(
                        resultado.getDate("nascimento").toLocalDate(),
                        resultado.getString("cpf"),
                        resultado.getString("telefone"),
                        resultado.getString("email"),
                        resultado.getInt("id"),
                        resultado.getString("nome")
                ));

            }

        } catch (SQLException e) {
            System.out.println("ERRO AO BUSCAR: " + e);
        }

        BancoDados.fecha(conn);

        return lista;
    }

    public static ArrayList buscaPaciente(String nome, String cpf) {
        ArrayList<Paciente> lista = new ArrayList<>();
        Connection conn = BancoDados.conectar();

        try {
            String sql = "SELECT * FROM paciente Where nome LIKE '%" + nome + "%' AND cpf = " + cpf;
            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                lista.add(new Paciente(
                        resultado.getDate("nascimento").toLocalDate(),
                        resultado.getString("cpf"),
                        resultado.getString("telefone"),
                        resultado.getString("email"),
                        resultado.getInt("id"),
                        resultado.getString("nome")
                ));

            }

        } catch (SQLException e) {
            System.out.println("ERRO AO BUSCAR: " + e);
        }

        BancoDados.fecha(conn);

        return lista;
    }

    public static int retornaIdPaciente(ArrayList<Paciente> lista) {

        int id = 0;

        if (lista.isEmpty()) {
            id = 0;

        } else {

            for (Paciente p : lista) {
                id = p.getId();
            }
        }

        return id;
    }

}
