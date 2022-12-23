package controllers;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import models.ConsultaAgendamento;
import models.Doutor;
import models.Paciente;
import services.BancoDados;
import services.Receber;

public class ConsultaAgenController {

    public static ConsultaAgendamento agendar() {
        ConsultaAgendamento a = new ConsultaAgendamento();

        System.out.println("\nAgendar Consulta\n");

        System.out.print("Informe o Nome do Paciente: ");
        String nomeP = Receber.texto();
        System.out.print("Informe o CPF do Paciente: ");
        String cpf = Receber.texto();

        a.setIdPaciente(retornaIdPaciente(nomeP, cpf));

        System.out.print("Informe o Nome do Doutor: ");
        String nome = Receber.texto();
        System.out.print("Informe a Especialidade do Doutor: ");
        String especialidade = Receber.texto();

        a.setIdDoutor(retornaIdDoutor(nome, especialidade));

        System.out.print("Informe a data e hora da Consulta: ");
        a.setDataHoraConsulta(Receber.dataHora());

        System.out.print("Informe o valor da Consulta: ");
        a.setValorConsulta(Receber.numeroDecimal());

        return a;
    }

    public static void addConsulta(ConsultaAgendamento a) {
        Connection conn = BancoDados.conectar();

        try {
            String sql = "INSERT INTO consultaAgendamento (idPaciente,idDoutor,dataHora,valor) VALUES (?,?,?,?)";

            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setInt(1, a.getIdPaciente());
            statement.setInt(2, a.getIdPaciente());
            statement.setString(3, a.getDataHoraConsulta().toString());
            statement.setDouble(4, a.getValorConsulta());

            if (statement.executeUpdate() > 0) {
                System.out.println("\n--------------------------------");
                System.out.println("Consulta Agendada com Sucesso!!!");
                System.out.println("--------------------------------\n");
            } else {
                System.err.println("\n------------------------------");
                System.err.println("Falha ao Agendar Consulta!!!");
                System.err.println("------------------------------\n");
            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        BancoDados.fecha(conn);
    }

    public static int retornaIdDoutor(String nome, String especialidade) {

        Connection conn = BancoDados.conectar();
        int id = 0;

        try {
            String sql = "SELECT id FROM doutor Where nome LIKE '%" + nome + "%' AND especialidade LIKE '%" + especialidade + "%'";
            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                Doutor d = new Doutor(
                        resultado.getString("cro"),
                        resultado.getString("especialidade"),
                        resultado.getInt("id"),
                        resultado.getString("nome")
                );

                id = resultado.getInt("id");

            }
        } catch (SQLException e) {
            System.out.println("ERRO AO BUSCAR: " + e);
        }

        BancoDados.fecha(conn);

        return id;
    }

    public static int retornaIdPaciente(String nome, String cpf) {

        int id = 0;
        Connection conn = BancoDados.conectar();

        try {
            String sql = "SELECT * FROM paciente Where nome LIKE '%" + nome + "%' AND cpf LIKE '%" + cpf + "%'";
            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                Paciente p = new Paciente(
                        resultado.getDate("nascimento").toLocalDate(),
                        resultado.getString("cpf"),
                        resultado.getString("telefone"),
                        resultado.getString("email"),
                        resultado.getInt("idPaciente"),
                        resultado.getString("nomePaciente")
                );

                id = resultado.getInt("idPaciente");
            }
        } catch (SQLException e) {
            System.out.println("ERRO AO BUSCAR: " + e);
        }

        BancoDados.fecha(conn);

        return id;
    }

}
