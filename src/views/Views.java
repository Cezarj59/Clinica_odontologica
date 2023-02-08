package views;

import models.Doutor;
import models.Paciente;
import models.ConsultaAgendamento;
import services.Constante;
import controllers.*;
import java.util.ArrayList;
import services.Receber;

public class Views {

    public static void consultaPacienteTodos() {
        ArrayList<Paciente> pacientes = Constante.paciente.getAll();
        System.out.println("\n----Consulta de Pacientes Todos----");
        if (pacientes.isEmpty()) {
            System.out.println("\nNão há Pacientes Cadastrados!!!\n");
        } else {
            for (Paciente p : pacientes) {
                System.out.println(p.toString());

            }
        }

    }

    public static void consultaPacienteNome() {
        System.out.print("Informe o Nome: ");
        String nomePaciente = "";

        ArrayList<Paciente> pacientesPorNome = Constante.paciente.getNome(nomePaciente);

        System.out.println("\n----Consulta de Pacientes por Nome----");
        if (pacientesPorNome.isEmpty()) {
            System.out.println("\nNão há Pacientes cadastrados com o nome: " + nomePaciente + "\n");
        } else {
            for (Paciente p : pacientesPorNome) {
                System.out.println(p.toString());
            }
        }

    }

    /*public static void consultaPacienteCpf() {
        System.out.print("Informe o CPF: ");
        String cpfPaciente = Receber.cpf();

        ArrayList<Paciente> pacientesPorCpf = Constante.paciente.getCpf(cpfPaciente);

        System.out.println("\n----Consulta de Pacientes por CPF----");
        if (pacientesPorCpf.isEmpty()) {
            System.out.println("\nNão há Pacientes cadastrados com o CPF: " + cpfPaciente + "\n");
        } else {
            for (Paciente p : pacientesPorCpf) {
                System.out.println(p.toString());
            }
        }

    }
*/
    public static void consultaPacienteAniversariante() {

        ArrayList<Paciente> pacientesAniversariantesDoMes = Constante.paciente.getAniversariantes();
        System.out.println("\n----Consulta de Pacientes Aniversariantes do Mês----");
        if (pacientesAniversariantesDoMes.isEmpty()) {
            System.out.println("\nNão há Pacientes aniversariantes este Mês\n");
        } else {
            for (Paciente p : pacientesAniversariantesDoMes) {
                System.out.println(p.toString());
            }
        }

    }

    public static void consultaDoutoresTodos() {
        ArrayList<Doutor> doutores = Constante.doutor.getAll();
        System.out.println("\n-------Consulta de Doutores Todos-------");
        if (doutores.isEmpty()) {
            System.out.println("\nNão há Doutores Cadastrados!!!\n");
        } else {
            for (Doutor d : doutores) {
                System.out.println(d.toString());

            }
        }

    }

    public static void consultaDoutorNome() {
        System.out.print("Informe o Nome: ");
        String nomeDoutor = "";
        
        ArrayList<Doutor> doutoresNome = Constante.doutor.getNome(nomeDoutor);
        System.out.println("\n----Consulta de Doutores por Nome----");
        if (doutoresNome.isEmpty()) {
            System.out.println("\nNão há Doutores cadastrados com o nome: " + nomeDoutor + "\n");
        } else {
            for (Doutor d : doutoresNome) {
                System.out.println(d.toString());

            }
        }

    }

    public static void consultaDoutorEspecialidade() {
        System.out.print("Informe a Especialidade: ");
        String especialidade = "";
        
        ArrayList<Doutor> doutoresPorEspec = Constante.doutor.getEspecialidade(especialidade);
        System.out.println("\n----Consulta de Doutores por Especialidade----");
        if (doutoresPorEspec.isEmpty()) {
            System.out.println("\nNão há Doutores cadastrados com a Especialidade: " + especialidade + "\n");
        } else {
            for (Doutor d : doutoresPorEspec) {
                System.out.println(d.toString());

            }
        }

    }

    public static void consultaAgendadaTodos() {
        ArrayList<ConsultaAgendamento> consultas = Constante.agendamento.getAll();
        System.out.println("\n----------Consulta-----------");
        if (consultas.isEmpty()) {
            System.out.println("\nNão há Consultas Agendadas!!!\n");
        } else {
            for (ConsultaAgendamento c : consultas) {
                System.out.println(c.toString());

            }
        }

    }

    public static void consultaAgendadaAtivas() {
        ArrayList<ConsultaAgendamento> consultas = Constante.agendamento.getAtivo();
        System.out.println("\n----------Consultas Ativas-----------");
        if (consultas.isEmpty()) {
            System.out.println("\nNão há Consultas Agendadas!!!\n");
        } else {
            for (ConsultaAgendamento c : consultas) {
                System.out.println(c.toString());

            }
        }

    }

    public static void consultaAgendadaHoje() {
        ArrayList<ConsultaAgendamento> consultasHoje = Constante.agendamento.getHoje();
        System.out.println("\n----------Consulta(s) Agendadas para Hoje-----------");
        if (consultasHoje.isEmpty()) {
            System.out.println("\nNão há consultas agendadas para Hoje!!!\n");
        } else {
            for (ConsultaAgendamento c : consultasHoje) {
                System.out.println(c.toString());

            }
        }

    }

    public static void consultaAgendadaEspecialidade() {
        System.out.print("Informe a Especialidade: ");
        String especialidade = "";
        
        ArrayList<ConsultaAgendamento> consultasPorEsp = Constante.agendamento.getEspecialidade(especialidade);
        System.out.println("\n----------Consulta(s) Por Especialidade -----------");
        if (consultasPorEsp.isEmpty()) {
            System.out.println("\nNão há consultas agendadas com está Especialidade!!!\n");
        } else {
            for (ConsultaAgendamento c : consultasPorEsp) {
                System.out.println(c.toString());

            }
        }

    }

    public static void consultaAgendadaNomePaciente() {
        System.out.print("Informe o nome do Paciente: ");
        String nomePaciente = "";
        
        ArrayList<ConsultaAgendamento> consultasPorPaciente = Constante.agendamento.getPaciente(nomePaciente);
        System.out.println("\n----------Consulta(s) Por Paciente-----------");
        if (consultasPorPaciente.isEmpty()) {
            System.out.println("\nNão há consultas agendadas com este Paciente!!!\n");
        } else {
            for (ConsultaAgendamento c : consultasPorPaciente) {
                System.out.println(c.toString());

            }
        }

    }

    public static void consultaAgendadaNomeDoutor() {
        System.out.print("Informe o nome do Doutor: ");
        String nomeDoutor = "";
        
        ArrayList<ConsultaAgendamento> consultasPorDoutor = Constante.agendamento.getDoutor(nomeDoutor);
        System.out.println("\n----------Consulta(s) Por Doutor-----------");
        if (consultasPorDoutor.isEmpty()) {
            System.out.println("\nNão há consultas agendadas com este Doutor!!!\n");
        } else {
            for (var c : consultasPorDoutor) {
                System.out.println(c.toString());

            }
        }

    }

}
