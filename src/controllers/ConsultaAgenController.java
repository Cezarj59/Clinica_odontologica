package controllers;

import java.sql.*;
import models.ConsultaAgendamento;
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
}
