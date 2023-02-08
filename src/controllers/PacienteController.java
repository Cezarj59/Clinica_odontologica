package controllers;

import controllers.interfaces.iPacienteController;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import models.Paciente;
import services.BancoDados;
import services.Receber;
import static views.Menu.menuAuxiliar;

public class PacienteController implements iPacienteController {

    @Override
    public Paciente cadastrar() {
        Paciente p = new Paciente();
        
        return p;
    }

    public void verificaCpf(String cpf) {

        ArrayList<Paciente> pacientesPorCpf = getCpf(cpf);

        for (Paciente p : pacientesPorCpf) {
            if (cpf.equals(p.getCpf())) {

            } else {
                p.setCpf(cpf);
            }
        }

    }

    @Override
    public void adicionar(Paciente p) {
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

    @Override
    public ArrayList<Paciente> getAll() {
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

    

    @Override
    public ArrayList<Paciente> getNome(String nome) {
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

    @Override
    public ArrayList<Paciente> getCpf(String cpf) {
        ArrayList<Paciente> lista = new ArrayList<>();
        Connection conn = BancoDados.conectar();

        try {
            String sql = "SELECT * FROM paciente Where cpf = " + cpf;
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

    @Override
    public ArrayList<Paciente> getAniversariantes() {
        ArrayList<Paciente> lista = new ArrayList<>();
        Connection conn = BancoDados.conectar();
        LocalDate hoje = LocalDate.now();

        try {
            String sql = "SELECT * FROM paciente";
            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {

                LocalDate dataAniversario = resultado.getDate("nascimento").toLocalDate();

                if (dataAniversario.getMonthValue() == hoje.getMonthValue()) {
                    lista.add(new Paciente(
                            resultado.getDate("nascimento").toLocalDate(),
                            resultado.getString("cpf"),
                            resultado.getString("telefone"),
                            resultado.getString("email"),
                            resultado.getInt("id"),
                            resultado.getString("nome")
                    ));
                }
            }

        } catch (SQLException e) {
            System.out.println("ERRO AO BUSCAR: " + e);
        }

        BancoDados.fecha(conn);

        return lista;
    }

    public ArrayList buscaPaciente(String nome, String cpf) {
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

}
