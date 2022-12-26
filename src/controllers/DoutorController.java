package controllers;

import java.sql.*;
import java.util.ArrayList;
import models.Doutor;
import services.BancoDados;
import services.Receber;

public class DoutorController {

    public static Doutor cadastrar() {
        Doutor d = new Doutor();
        System.out.println("\nCADASTRAR DOUTOR\n");

        System.out.print("Informe o Nome: ");
        d.setNome(Receber.texto());
        System.out.print("Informe o CRO: ");
        d.setCro(Receber.texto());
        System.out.println("\nInforme a Especialidade, caso seja mais de uma, \nsepare-as utilizando virgulas.");
        System.out.print("\nDigite: ");
        d.setEspecialidade(Receber.texto());

        return d;
    }

    public static void addDoutor(Doutor d) {
        Connection conn = BancoDados.conectar();

        try {
            String sql = "INSERT INTO doutor (cro,especialidade,nome) VALUES (?,?,?)";

            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, d.getCro());
            statement.setString(2, d.getEspecialidade());
            statement.setString(3, d.getNome());

            if (statement.executeUpdate() > 0) {
                System.out.println("\n--------------------------------");
                System.out.println("Doutor Cadastrado com Sucesso!!!");
                System.out.println("--------------------------------\n");
            } else {
                System.err.println("\n------------------------------");
                System.err.println("Falha ao Cadastrar o Doutor!!!");
                System.err.println("------------------------------\n");
            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        BancoDados.fecha(conn);
    }

     public static int informaDoutorParaConsulta() {

        System.out.print("Informe o Nome do Doutor: ");
        String nome = Receber.texto();
        System.out.print("Informe a Especialidade do Doutor: ");
        String especialidade = Receber.texto();

        return DoutorController.retornaIdDoutor(DoutorController.buscaDoutor(nome, especialidade));
    }

  

    public static int idDoutor() {
        int id = informaDoutorParaConsulta();
        while (id == 0) {
            System.err.println("\nDoutor não Localizado na Base de dados.");
            System.err.println("Verifique se os dados foram digitados corretamente, NOME e ESPECIALIDADE.");
            System.err.println("TENTE NOVAMENTE!!!\n");
            id = idDoutor();
        }

        return id;
    }
    
    public static ArrayList<Doutor> getAll() {
        ArrayList<Doutor> lista = new ArrayList<>();
        Connection conn = BancoDados.conectar();

        try {
            String sql = "SELECT * FROM doutor";
            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                lista.add(new Doutor(
                        resultado.getString("cro"),
                        resultado.getString("especialidade"),
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

    public static ArrayList<Doutor> getNome(String nome) {
        ArrayList<Doutor> lista = new ArrayList<>();
        Connection conn = BancoDados.conectar();

        try {
            String sql = "SELECT * FROM doutor WHERE nome LIKE '%" + nome + "%'";
            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                lista.add(new Doutor(
                        resultado.getString("cro"),
                        resultado.getString("especialidade"),
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

    public static ArrayList<Doutor> getEspecialidade(String especialidade) {
        ArrayList<Doutor> lista = new ArrayList<>();
        Connection conn = BancoDados.conectar();

        try {
            String sql = "SELECT * FROM doutor WHERE especialidade LIKE '%" + especialidade + "%'";
            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                lista.add(new Doutor(
                        resultado.getString("cro"),
                        resultado.getString("especialidade"),
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

    public static ArrayList buscaDoutor(String nome, String esp) {
        ArrayList<Doutor> lista = new ArrayList<>();
        Connection conn = BancoDados.conectar();

        try {
            String sql = "SELECT * FROM doutor Where nome LIKE '%" + nome + "%' AND especialidade LIKE '%" + esp + "%'";
            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                lista.add(new Doutor(
                        resultado.getString("cro"),
                        resultado.getString("especialidade"),
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

    public static int retornaIdDoutor(ArrayList<Doutor> lista) {

        int id = 0;

        if (lista.isEmpty()) {
            id = 0;

        } else {

            for (Doutor d : lista) {
                id = d.getId();
            }
        }

        return id;
    }

}
