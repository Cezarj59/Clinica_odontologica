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
                        resultado.getInt("idDoutor"),
                        resultado.getString("nomeDoutor")
                ));

            }

        } catch (SQLException e) {
            System.out.println("ERRO AO BUSCAR: " + e);
        }

        BancoDados.fecha(conn);

        return lista;
    }

}
