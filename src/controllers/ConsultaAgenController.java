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

    public static int agendarConsultaPaciente() {

        System.out.print("Informe o Nome do Paciente: ");
        String nome = Receber.texto();
        System.out.print("Informe o CPF do Paciente: ");
        String cpf = Receber.cpf();

        return PacienteController.retornaIdPaciente(PacienteController.buscaPaciente(nome, cpf));
    }

    public static int agendarConsultaDoutor() {

        System.out.print("Informe o Nome do Doutor: ");
        String nome = Receber.texto();
        System.out.print("Informe a Especialidade do Doutor: ");
        String especialidade = Receber.texto();

        return DoutorController.retornaIdDoutor(DoutorController.buscaDoutor(nome, especialidade));
    }

    

  

    public static ConsultaAgendamento agendar() {
        ConsultaAgendamento a = new ConsultaAgendamento();

        System.out.println("\nAgendar Consulta\n");

        a.setIdPaciente(0);

        a.setIdDoutor(0);

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
