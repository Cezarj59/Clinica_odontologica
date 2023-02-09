package controllers;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import models.ConsultaAgendamento;
import models.Doutor;
import models.Paciente;
import services.BancoDados;
import controllers.interfaces.iAgendaConsultaController;
import javax.swing.JOptionPane;
import services.Receber;

public class AgendaConsultaController implements iAgendaConsultaController {

    @Override
    public ConsultaAgendamento agendar(String cpf, String data, String especialidade, String hora, String nomeDoutor, String nomePaciente, String valor) {
        ConsultaAgendamento c = new ConsultaAgendamento();
        DoutorController dController = new DoutorController();
        PacienteController pController = new PacienteController();

        c.setIdPaciente(AgendaConsultaController.retornaIdPaciente(pController.buscaPaciente(nomePaciente, cpf)));
        c.setIdDoutor(retornaIdDoutor(dController.buscaDoutor(nomeDoutor, especialidade)));
        c.setDataHoraConsulta(Receber.dataHora(data, hora));

        c.setValorConsulta(Receber.numeroDecimal(valor));

        return c;
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

    @Override
    public void adicionar(ConsultaAgendamento a) {
        Connection conn = BancoDados.conectar();

        try {
            String sql = "INSERT INTO consultaAgendamento (idPaciente,idDoutor,dataHora,valor) VALUES (?,?,?,?)";

            PreparedStatement statement = conn.prepareStatement(sql);

            statement.setInt(1, a.getIdPaciente());
            statement.setInt(2, a.getIdDoutor());
            statement.setString(3, a.getDataHoraConsulta().toString());
            statement.setDouble(4, a.getValorConsulta());

            if (statement.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Consulta Agendada com Sucesso!!!");

            } else {
                JOptionPane.showMessageDialog(null, "Falha ao Agendar Consulta!!!");
            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        BancoDados.fecha(conn);
    }

    public static void alteraStatus() {
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

    @Override
    public ArrayList<ConsultaAgendamento> getAll() {
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
                        new Paciente(
                                resultado.getDate("dataNascimento").toLocalDate(),
                                resultado.getString("cpf"),
                                resultado.getString("telefone"),
                                resultado.getString("email"),
                                resultado.getInt("idPaciente"),
                                resultado.getString("nomePaciente")
                        ),
                        new Doutor(
                                resultado.getString("cro"),
                                resultado.getString("especialidade"),
                                resultado.getInt("idDoutor"),
                                resultado.getString("nomeDoutor")
                        ),
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

    @Override
    public ArrayList<ConsultaAgendamento> getAtivo() {
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
                boolean status = resultado.getBoolean("status");

                if (status) {
                    lista.add(new ConsultaAgendamento(
                            new Paciente(
                                    resultado.getDate("dataNascimento").toLocalDate(),
                                    resultado.getString("cpf"),
                                    resultado.getString("telefone"),
                                    resultado.getString("email"),
                                    resultado.getInt("idPaciente"),
                                    resultado.getString("nomePaciente")
                            ),
                            new Doutor(
                                    resultado.getString("cro"),
                                    resultado.getString("especialidade"),
                                    resultado.getInt("idDoutor"),
                                    resultado.getString("nomeDoutor")
                            ),
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

    @Override
    public ArrayList<ConsultaAgendamento> getHoje() {
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
                            new Paciente(
                                    resultado.getDate("dataNascimento").toLocalDate(),
                                    resultado.getString("cpf"),
                                    resultado.getString("telefone"),
                                    resultado.getString("email"),
                                    resultado.getInt("idPaciente"),
                                    resultado.getString("nomePaciente")
                            ),
                            new Doutor(
                                    resultado.getString("cro"),
                                    resultado.getString("especialidade"),
                                    resultado.getInt("idDoutor"),
                                    resultado.getString("nomeDoutor")
                            ),
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

    @Override
    public ArrayList<ConsultaAgendamento> getEspecialidade(String especialidade) {
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
                    + " INNER JOIN doutor ON consultaAgendamento.idDoutor = doutor.id"
                    + " WHERE doutor.especialidade LIKE '%" + especialidade + "%'";

            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {

                lista.add(new ConsultaAgendamento(
                        new Paciente(
                                resultado.getDate("dataNascimento").toLocalDate(),
                                resultado.getString("cpf"),
                                resultado.getString("telefone"),
                                resultado.getString("email"),
                                resultado.getInt("idPaciente"),
                                resultado.getString("nomePaciente")
                        ),
                        new Doutor(
                                resultado.getString("cro"),
                                resultado.getString("especialidade"),
                                resultado.getInt("idDoutor"),
                                resultado.getString("nomeDoutor")
                        ),
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

    @Override
    public ArrayList<ConsultaAgendamento> getPaciente(String nome) {
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
                    + " INNER JOIN doutor ON consultaAgendamento.idDoutor = doutor.id"
                    + " WHERE paciente.nome LIKE '%" + nome + "%'";

            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {

                lista.add(new ConsultaAgendamento(
                        new Paciente(
                                resultado.getDate("dataNascimento").toLocalDate(),
                                resultado.getString("cpf"),
                                resultado.getString("telefone"),
                                resultado.getString("email"),
                                resultado.getInt("idPaciente"),
                                resultado.getString("nomePaciente")
                        ),
                        new Doutor(
                                resultado.getString("cro"),
                                resultado.getString("especialidade"),
                                resultado.getInt("idDoutor"),
                                resultado.getString("nomeDoutor")
                        ),
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

    @Override
    public ArrayList<ConsultaAgendamento> getDoutor(String nome) {
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
                    + " INNER JOIN doutor ON consultaAgendamento.idDoutor = doutor.id"
                    + " WHERE doutor.nome LIKE '%" + nome + "%'";

            Statement statement = conn.createStatement();

            ResultSet resultado = statement.executeQuery(sql);

            while (resultado.next()) {

                lista.add(new ConsultaAgendamento(
                        new Paciente(
                                resultado.getDate("dataNascimento").toLocalDate(),
                                resultado.getString("cpf"),
                                resultado.getString("telefone"),
                                resultado.getString("email"),
                                resultado.getInt("idPaciente"),
                                resultado.getString("nomePaciente")
                        ),
                        new Doutor(
                                resultado.getString("cro"),
                                resultado.getString("especialidade"),
                                resultado.getInt("idDoutor"),
                                resultado.getString("nomeDoutor")
                        ),
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
