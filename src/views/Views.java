package views;

import models.Doutor;
import models.Paciente;
import models.ConsultaAgendamento;
import services.Constante;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import services.Receber;

public class Views {

    public static void consultaPacienteTodos(JTable tabela) {
        ArrayList<Paciente> pacientes = Constante.paciente.getAll();

        if (pacientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "\nNão há Pacientes Cadastrados!!!\n");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

            for (Paciente p : pacientes) {
                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getNome(),
                    p.getNascimento(),
                    p.getCpf(),
                    p.getTelefone(),
                    p.getEmail()});

            }
        }

    }

    public static void consultaPacienteNome(String nomePaciente, JTable tabela) {

        ArrayList<Paciente> pacientesPorNome = Constante.paciente.getNome(nomePaciente);

        if (pacientesPorNome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "\nNão há Pacientes cadastrados com o nome: " + nomePaciente + "\n");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

            for (Paciente p : pacientesPorNome) {
                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getNome(),
                    p.getNascimento(),
                    p.getCpf(),
                    p.getTelefone(),
                    p.getEmail()});

            }
        }

    }

    public static void consultaPacienteCpf(String cpfPaciente, JTable tabela) {

        ArrayList<Paciente> pacientesPorCpf = Constante.paciente.getCpf(Receber.cpf(cpfPaciente));

        if (pacientesPorCpf.isEmpty()) {
            JOptionPane.showMessageDialog(null, "\nNão há Pacientes cadastrados com o CPF: " + cpfPaciente);
        } else {

            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

            for (Paciente p : pacientesPorCpf) {
                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getNome(),
                    p.getNascimento(),
                    p.getCpf(),
                    p.getTelefone(),
                    p.getEmail()});

            }

        }

    }

    public static void consultaPacienteAniversariante(JTable tabela) {

        ArrayList<Paciente> pacientesAniversariantesDoMes = Constante.paciente.getAniversariantes();

        if (pacientesAniversariantesDoMes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "\nNão há Pacientes aniversariantes este Mês\n");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

            for (Paciente p : pacientesAniversariantesDoMes) {
                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getNome(),
                    p.getNascimento(),
                    p.getCpf(),
                    p.getTelefone(),
                    p.getEmail()});

            }
        }

    }

    public static void consultaDoutoresTodos(JTable tabela) {
        ArrayList<Doutor> doutores = Constante.doutor.getAll();

        if (doutores.isEmpty()) {
            JOptionPane.showMessageDialog(null, "\nNão há Doutores Cadastrados!!!\n");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

            for (Doutor d : doutores) {
                modelo.addRow(new Object[]{
                    d.getId(),
                    d.getNome(),
                    d.getEspecialidade(),
                    d.getCro()
                });

            }
        }

    }

    public static void consultaDoutorNome(String nomeDoutor, JTable tabela) {

        ArrayList<Doutor> doutoresNome = Constante.doutor.getNome(nomeDoutor);

        if (doutoresNome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "\nNão há Doutores cadastrados com o nome: " + nomeDoutor + "\n");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

            for (Doutor d : doutoresNome) {
                modelo.addRow(new Object[]{
                    d.getId(),
                    d.getNome(),
                    d.getEspecialidade(),
                    d.getCro()});

            }
        }

    }

    public static void consultaDoutorEspecialidade(String especialidade, JTable tabela) {

        ArrayList<Doutor> doutoresEspecialidades = Constante.doutor.getEspecialidade(especialidade);

        if (doutoresEspecialidades.isEmpty()) {
            JOptionPane.showMessageDialog(null, "\nNão há Doutores cadastrados com a Especialidade: " + especialidade + "\n");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

            for (Doutor d : doutoresEspecialidades) {
                modelo.addRow(new Object[]{
                    d.getId(),
                    d.getNome(),
                    d.getEspecialidade(),
                    d.getCro()});

            }
        }

    }

    public static void consultaAgendadaTodos(JTable tabela) {
        ArrayList<ConsultaAgendamento> consultas = Constante.agendamento.getAll();

        if (consultas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "\nNão há Consultas Agendadas!!!\n");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            for (ConsultaAgendamento p : consultas) {
                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getPaciente().getNome(),
                    p.getDoutor().getNome(),
                    p.getDoutor().getEspecialidade(),
                    p.getDataHoraConsultaFormated(),
                    p.getValorConsulta(),
                    p.isStatusConsulta() ? "Agendada" : "Expirada"});

            }
        }

    }

    public static void consultaAgendadaAtivas(JTable tabela) {
        ArrayList<ConsultaAgendamento> consultasAtivas = Constante.agendamento.getAtivo();
        if (consultasAtivas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "\nNão há Consultas Agendadas!!!\n");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            for (ConsultaAgendamento p : consultasAtivas) {
                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getPaciente().getNome(),
                    p.getDoutor().getNome(),
                    p.getDoutor().getEspecialidade(),
                    p.getDataHoraConsultaFormated(),
                    p.getValorConsulta(),
                    p.isStatusConsulta() ? "Agendada" : "Expirada"});

            }
        }

    }

    public static void consultaAgendadaHoje(JTable tabela) {
        ArrayList<ConsultaAgendamento> consultasHoje = Constante.agendamento.getHoje();

        if (consultasHoje.isEmpty()) {
            JOptionPane.showMessageDialog(null, "\nNão há consultas agendadas para Hoje!!!\n");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            for (ConsultaAgendamento p : consultasHoje) {
                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getPaciente().getNome(),
                    p.getDoutor().getNome(),
                    p.getDoutor().getEspecialidade(),
                    p.getDataHoraConsultaFormated(),
                    p.getValorConsulta(),
                    p.isStatusConsulta() ? "Agendada" : "Expirada"});

            }
        }

    }

    public static void consultaAgendadaEspecialidade(String especialidade, JTable tabela) {

        ArrayList<ConsultaAgendamento> consultasEspecialidade = Constante.agendamento.getEspecialidade(especialidade);

        if (consultasEspecialidade.isEmpty()) {
            JOptionPane.showMessageDialog(null, "\nNão há consultas agendadas com está Especialidade!!!\n");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            for (ConsultaAgendamento p : consultasEspecialidade) {
                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getPaciente().getNome(),
                    p.getDoutor().getNome(),
                    p.getDoutor().getEspecialidade(),
                    p.getDataHoraConsultaFormated(),
                    p.getValorConsulta(),
                    p.isStatusConsulta() ? "Agendada" : "Expirada"});

            }
        }

    }

    public static void consultaAgendadaNomePaciente(String nome, JTable tabela) {

        ArrayList<ConsultaAgendamento> consultasPorPaciente = Constante.agendamento.getPaciente(nome);

        if (consultasPorPaciente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "\nNão há consultas agendadas com este Paciente!!!\n");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            for (ConsultaAgendamento p : consultasPorPaciente) {
                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getPaciente().getNome(),
                    p.getDoutor().getNome(),
                    p.getDoutor().getEspecialidade(),
                    p.getDataHoraConsultaFormated(),
                    p.getValorConsulta(),
                    p.isStatusConsulta() ? "Agendada" : "Expirada"});

            }
        }

    }

    public static void consultaAgendadaNomeDoutor(String nome, JTable tabela) {

        ArrayList<ConsultaAgendamento> consultasPorDoutor = Constante.agendamento.getDoutor(nome);

        if (consultasPorDoutor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "\nNão há consultas agendadas com este Doutor!!!\n");
        } else {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            for (ConsultaAgendamento p : consultasPorDoutor) {
                modelo.addRow(new Object[]{
                    p.getId(),
                    p.getPaciente().getNome(),
                    p.getDoutor().getNome(),
                    p.getDoutor().getEspecialidade(),
                    p.getDataHoraConsultaFormated(),
                    p.getValorConsulta(),
                    p.isStatusConsulta() ? "Agendada" : "Expirada"});

            }
        }

    }

}
