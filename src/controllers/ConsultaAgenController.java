package controllers;

import java.sql.*;
import java.time.LocalTime;
import java.time.OffsetTime;
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

        a.setIdPaciente(PacienteController.idPaciente());

        a.setIdDoutor(DoutorController.idDoutor());

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
                    + " FROM consultaAgendamento INNER JOIN paciente"
                    + " INNER JOIN doutor ON paciente.id = doutor.id";
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
