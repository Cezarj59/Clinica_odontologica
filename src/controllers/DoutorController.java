package controllers;

import java.sql.*;
import java.util.ArrayList;
import models.Doutor;
import services.BancoDados;
import controllers.interfaces.iDoutorController;
import javax.swing.JOptionPane;

public class DoutorController implements iDoutorController {

    @Override
       public Doutor cadastrar(String nome, String cro, String especialidade) {
        Doutor d = new Doutor();
        d.setNome(nome);
        d.setCro(cro);
        d.setEspecialidade(especialidade);

        return d;
    }

    @Override
    public void adicionar(Doutor d) {
        Connection conn = BancoDados.conectar();

        try {
            String sql = "INSERT INTO doutor (cro,especialidade,nome) VALUES (?,?,?)";

            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setString(1, d.getCro());
            statement.setString(2, d.getEspecialidade());
            statement.setString(3, d.getNome());

            if (statement.executeUpdate() > 0) {
               
                 JOptionPane.showMessageDialog(null, "Doutor Cadastrado com Sucesso!!!");
               
            } else {
               
                JOptionPane.showMessageDialog(null, "Falha ao Cadastrar o Doutor!!!");
             
            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        BancoDados.fecha(conn);
    }

    @Override
    public ArrayList<Doutor> getAll() {
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

    @Override
    public ArrayList<Doutor> getNome(String nome) {
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

    @Override
    public ArrayList<Doutor> getEspecialidade(String especialidade) {
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

    public ArrayList buscaDoutor(String nome, String esp) {
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

}
