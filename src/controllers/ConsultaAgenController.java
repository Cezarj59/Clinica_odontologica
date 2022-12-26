package controllers;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import models.ConsultaAgendamento;
import services.BancoDados;
import services.Receber;

public class ConsultaAgenController {

    public static ConsultaAgendamento agendar() {
        ConsultaAgendamento a = new ConsultaAgendamento();

        System.out.println("\nAgendar Consulta\n");

        a.setIdPaciente(PacienteController.idPaciente());

        a.setIdDoutor(DoutorController.idDoutor());

        System.out.println("Informe a data e hora da Consulta.");
        
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
            statement.setInt(2, a.getIdDoutor());
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

    public static void alteraStatus() {
        ConsultaAgendamento a = new ConsultaAgendamento();
        Connection conn = BancoDados.conectar();

        try {
            Statement statement = conn.createStatement();

            String sql = "UPDATE consultaAgendamento SET status = FALSE WHERE dataHora < CURRENT_TIMESTAMP";

            int updateCount = statement.executeUpdate(sql);

        } catch (SQLException e) {
            System.err.println(e);
        }

        BancoDados.fecha(conn);
    }

    public static ArrayList<ConsultaAgendamento> getAll() {
        ArrayList<ConsultaAgendamento> lista = new ArrayList<>();
        Connection conn = BancoDados.conectar();

        try {
            String sql = "SELECT consultaAgendamento.id AS idConsulta,"
                    + " paciente.id AS idPaciente,"
                    + " paciente.nome AS nomePaciente,"
                    + " paciente.nascimento AS dataNascimento,"
                    + " paciente.email AS email,"
                    + " paciente.cpf AS cpf,"
                    + " paciente.telefone AS telefone,"
                    + " doutor.id AS idDoutor,"
                    + " doutor.nome AS nomeDoutor,"
                    + " doutor.cro AS cro,"
                    + " doutor.especialidade AS especialidade,"
                    + " consultaAgendamento.dataHora AS dataHora,"
                    + " consultaAgendamento.valor AS valor,"
                    + " consultaAgendamento.status AS status"
                    + " FROM consultaAgendamento"
                    + " INNER JOIN paciente ON consultaAgendamento.idPaciente = paciente.id"
                    + " INNER JOIN doutor ON consultaAgendamento.idDoutor = doutor.id";

            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                lista.add(new ConsultaAgendamento(
                        resultado.getDate("dataNascimento").toLocalDate(),
                        resultado.getString("cpf"),
                        resultado.getString("telefone"),
                        resultado.getString("email"),
                        resultado.getInt("idPaciente"),
                        resultado.getString("nomePaciente"),
                        resultado.getString("cro"),
                        resultado.getString("especialidade"),
                        resultado.getInt("idDoutor"),
                        resultado.getString("nomeDoutor"),
                        resultado.getInt("idConsulta"),
                        resultado.getTimestamp("dataHora").toLocalDateTime(),
                        resultado.getDouble("valor"),
                        resultado.getBoolean("status")
                ));

            }

        } catch (SQLException e) {
            System.out.println("ERRO AO BUSCAR: " + e);
        }

        BancoDados.fecha(conn);

        return lista;
    }

    public static ArrayList<ConsultaAgendamento> getHoje() {
        ArrayList<ConsultaAgendamento> lista = new ArrayList<>();
        Connection conn = BancoDados.conectar();
        LocalDateTime hoje = LocalDateTime.now();

        try {
            String sql = "SELECT consultaAgendamento.id AS idConsulta,"
                    + " paciente.id AS idPaciente,"
                    + " paciente.nome AS nomePaciente,"
                    + " paciente.nascimento AS dataNascimento,"
                    + " paciente.email AS email,"
                    + " paciente.cpf AS cpf,"
                    + " paciente.telefone AS telefone,"
                    + " doutor.id AS idDoutor,"
                    + " doutor.nome AS nomeDoutor,"
                    + " doutor.cro AS cro,"
                    + " doutor.especialidade AS especialidade,"
                    + " consultaAgendamento.dataHora AS dataHora,"
                    + " consultaAgendamento.valor AS valor,"
                    + " consultaAgendamento.status AS status"
                    + " FROM consultaAgendamento"
                    + " INNER JOIN paciente ON consultaAgendamento.idPaciente = paciente.id"
                    + " INNER JOIN doutor ON consultaAgendamento.idDoutor = doutor.id";

            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {
                LocalDateTime dataAgendada = resultado.getTimestamp("dataHora").toLocalDateTime();

                if (dataAgendada.getDayOfMonth() == hoje.getDayOfMonth()) {
                    lista.add(new ConsultaAgendamento(
                            resultado.getDate("dataNascimento").toLocalDate(),
                            resultado.getString("cpf"),
                            resultado.getString("telefone"),
                            resultado.getString("email"),
                            resultado.getInt("idPaciente"),
                            resultado.getString("nomePaciente"),
                            resultado.getString("cro"),
                            resultado.getString("especialidade"),
                            resultado.getInt("idDoutor"),
                            resultado.getString("nomeDoutor"),
                            resultado.getInt("idConsulta"),
                            resultado.getTimestamp("dataHora").toLocalDateTime(),
                            resultado.getDouble("valor"),
                            resultado.getBoolean("status")
                    ));
                }

            }

        } catch (SQLException e) {
            System.out.println("ERRO AO BUSCAR: " + e);
        }

        BancoDados.fecha(conn);

        return lista;
    }

    public static ArrayList<ConsultaAgendamento> getEspecialidade(String especialidadeParametro) {
        ArrayList<ConsultaAgendamento> lista = new ArrayList<>();
        Connection conn = BancoDados.conectar();
        LocalDateTime hoje = LocalDateTime.now();

        try {
            String sql = "SELECT consultaAgendamento.id AS idConsulta,"
                    + " paciente.id AS idPaciente,"
                    + " paciente.nome AS nomePaciente,"
                    + " paciente.nascimento AS dataNascimento,"
                    + " paciente.email AS email,"
                    + " paciente.cpf AS cpf,"
                    + " paciente.telefone AS telefone,"
                    + " doutor.id AS idDoutor,"
                    + " doutor.nome AS nomeDoutor,"
                    + " doutor.cro AS cro,"
                    + " doutor.especialidade AS especialidade,"
                    + " consultaAgendamento.dataHora AS dataHora,"
                    + " consultaAgendamento.valor AS valor,"
                    + " consultaAgendamento.status AS status"
                    + " FROM consultaAgendamento"
                    + " INNER JOIN paciente ON consultaAgendamento.idPaciente = paciente.id"
                    + " INNER JOIN doutor ON consultaAgendamento.idDoutor = doutor.id"
                    + " WHERE doutor.especialidade LIKE '%" + especialidadeParametro + "%'";

            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {

                lista.add(new ConsultaAgendamento(
                        resultado.getDate("dataNascimento").toLocalDate(),
                        resultado.getString("cpf"),
                        resultado.getString("telefone"),
                        resultado.getString("email"),
                        resultado.getInt("idPaciente"),
                        resultado.getString("nomePaciente"),
                        resultado.getString("cro"),
                        resultado.getString("especialidade"),
                        resultado.getInt("idDoutor"),
                        resultado.getString("nomeDoutor"),
                        resultado.getInt("idConsulta"),
                        resultado.getTimestamp("dataHora").toLocalDateTime(),
                        resultado.getDouble("valor"),
                        resultado.getBoolean("status")
                ));

            }

        } catch (SQLException e) {
            System.out.println("ERRO AO BUSCAR: " + e);
        }

        BancoDados.fecha(conn);

        return lista;
    }

    public static ArrayList<ConsultaAgendamento> getPaciente(String nomePacienteParametro) {
        ArrayList<ConsultaAgendamento> lista = new ArrayList<>();
        Connection conn = BancoDados.conectar();
        LocalDateTime hoje = LocalDateTime.now();

        try {
            String sql = "SELECT consultaAgendamento.id AS idConsulta,"
                    + " paciente.id AS idPaciente,"
                    + " paciente.nome AS nomePaciente,"
                    + " paciente.nascimento AS dataNascimento,"
                    + " paciente.email AS email,"
                    + " paciente.cpf AS cpf,"
                    + " paciente.telefone AS telefone,"
                    + " doutor.id AS idDoutor,"
                    + " doutor.nome AS nomeDoutor,"
                    + " doutor.cro AS cro,"
                    + " doutor.especialidade AS especialidade,"
                    + " consultaAgendamento.dataHora AS dataHora,"
                    + " consultaAgendamento.valor AS valor,"
                    + " consultaAgendamento.status AS status"
                    + " FROM consultaAgendamento"
                    + " INNER JOIN paciente ON consultaAgendamento.idPaciente = paciente.id"
                    + " INNER JOIN doutor ON consultaAgendamento.idDoutor = doutor.id"
                    + " WHERE paciente.nome LIKE '%" + nomePacienteParametro + "%'";

            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {

                lista.add(new ConsultaAgendamento(
                        resultado.getDate("dataNascimento").toLocalDate(),
                        resultado.getString("cpf"),
                        resultado.getString("telefone"),
                        resultado.getString("email"),
                        resultado.getInt("idPaciente"),
                        resultado.getString("nomePaciente"),
                        resultado.getString("cro"),
                        resultado.getString("especialidade"),
                        resultado.getInt("idDoutor"),
                        resultado.getString("nomeDoutor"),
                        resultado.getInt("idConsulta"),
                        resultado.getTimestamp("dataHora").toLocalDateTime(),
                        resultado.getDouble("valor"),
                        resultado.getBoolean("status")
                ));

            }

        } catch (SQLException e) {
            System.out.println("ERRO AO BUSCAR: " + e);
        }

        BancoDados.fecha(conn);

        return lista;
    }

    public static ArrayList<ConsultaAgendamento> getDoutor(String nomeDoutorParametro) {
        ArrayList<ConsultaAgendamento> lista = new ArrayList<>();
        Connection conn = BancoDados.conectar();
        LocalDateTime hoje = LocalDateTime.now();

        try {
            String sql = "SELECT consultaAgendamento.id AS idConsulta,"
                    + " paciente.id AS idPaciente,"
                    + " paciente.nome AS nomePaciente,"
                    + " paciente.nascimento AS dataNascimento,"
                    + " paciente.email AS email,"
                    + " paciente.cpf AS cpf,"
                    + " paciente.telefone AS telefone,"
                    + " doutor.id AS idDoutor,"
                    + " doutor.nome AS nomeDoutor,"
                    + " doutor.cro AS cro,"
                    + " doutor.especialidade AS especialidade,"
                    + " consultaAgendamento.dataHora AS dataHora,"
                    + " consultaAgendamento.valor AS valor,"
                    + " consultaAgendamento.status AS status"
                    + " FROM consultaAgendamento"
                    + " INNER JOIN paciente ON consultaAgendamento.idPaciente = paciente.id"
                    + " INNER JOIN doutor ON consultaAgendamento.idDoutor = doutor.id"
                    + " WHERE doutor.nome LIKE '%" + nomeDoutorParametro + "%'";

            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {

                lista.add(new ConsultaAgendamento(
                        resultado.getDate("dataNascimento").toLocalDate(),
                        resultado.getString("cpf"),
                        resultado.getString("telefone"),
                        resultado.getString("email"),
                        resultado.getInt("idPaciente"),
                        resultado.getString("nomePaciente"),
                        resultado.getString("cro"),
                        resultado.getString("especialidade"),
                        resultado.getInt("idDoutor"),
                        resultado.getString("nomeDoutor"),
                        resultado.getInt("idConsulta"),
                        resultado.getTimestamp("dataHora").toLocalDateTime(),
                        resultado.getDouble("valor"),
                        resultado.getBoolean("status")
                ));

            }

        } catch (SQLException e) {
            System.out.println("ERRO AO BUSCAR: " + e);
        }

        BancoDados.fecha(conn);

        return lista;
    }
}
