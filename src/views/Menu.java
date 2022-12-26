package views;

import controllers.ConsultaAgenController;
import controllers.DoutorController;
import controllers.PacienteController;
import java.util.ArrayList;
import models.ConsultaAgendamento;
import models.Doutor;
import models.Paciente;
import services.Receber;

class Menu {

    protected static void inicio() {
        while (true) {
            System.out.println("\n-----------------------------");
            System.out.println("-----CLINICA ODONTOLÓGICA------");
            System.out.println("-----------------------------\n");

            System.out.println("(0) #- SAIR -#");
            System.out.println("(1) Cadastrar");
            System.out.println("(2) Consultar");
            System.out.print("\nInforme a opção desejada: ");

            switch (Receber.inteiro()) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    cadastrar();
                    break;
                case 2:
                    consultar();
                    break;
                default:
                    System.out.println("\nOpção Invalida!!!\n");

            }
        }

    }

    private static void cadastrar() {
        System.out.println("\n-----------------------------");
        System.out.println("----------CADASTRO-----------");
        System.out.println("-----------------------------\n");

        System.out.println("(1) Paciente");
        System.out.println("(2) Doutor");
        System.out.println("(3) Agendar Consulta");
        System.out.println("(0) Voltar");
        System.out.print("\nInforme a opção desejada: ");

        switch (Receber.inteiro()) {

            case 1 ->
                PacienteController.addPaciente(PacienteController.cadastrar());
            case 2 ->
                DoutorController.addDoutor(DoutorController.cadastrar());
            case 3 ->
                ConsultaAgenController.addConsulta(ConsultaAgenController.agendar());
            case 0 ->
                inicio();
            default -> {
                System.out.println("\nOpção Invalida!!!\n");

            }
        }
    }

    private static void consultar() {
        System.out.println("\n-----------------------------");
        System.out.println("----------CONSULTA-----------");
        System.out.println("-----------------------------\n");

        System.out.println("(1) Pacientes");
        System.out.println("(2) Doutores");
        System.out.println("(3) Consultas Agendadas");
        System.out.println("(0) Voltar");
        System.out.print("\nInforme a opção desejada: ");

        switch (Receber.inteiro()) {

            case 1 ->
                consultaPacientes();
            case 2 ->
                consultaDoutores();
            case 3 ->
                consultasAgendadas();
            case 0 ->
                inicio();
            default -> {
                System.out.println("\nOpção Invalida!!!\n");

            }
        }
    }

    private static void consultaPacientes() {
        System.out.println("\n-----------------------------");
        System.out.println("-----CONSULTA DE PACIENTES-----");
        System.out.println("-----------------------------\n");

        System.out.println("(1) Todos");
        System.out.println("(2) Nome");
        System.out.println("(3) CPF");
        System.out.println("(4) Aniversariantes do Mês");
        System.out.println("(0) Voltar");
        System.out.print("\nInforme a opção desejada: ");

        switch (Receber.inteiro()) {

            case 1 -> {
                ArrayList<Paciente> pacientes = PacienteController.getAll();
                System.out.println("\n----Consulta de Pacientes Todos----");
                if (pacientes.isEmpty()) {
                    System.out.println("\nNão há Pacientes Cadastrados!!!\n");
                } else {
                    for (Paciente p : pacientes) {
                        System.out.println(p.toString());

                    }
                }
            }
            case 2 -> {
                System.out.print("Informe o Nome: ");
                String nomePaciente = Receber.texto();
                ArrayList<Paciente> pacientesPorNome = PacienteController.getNome(nomePaciente);
                System.out.println("\n----Consulta de Pacientes por Nome----");
                if (pacientesPorNome.isEmpty()) {
                    System.out.println("\nNão há Pacientes cadastrados com o nome: " + nomePaciente + "\n");
                } else {
                    for (Paciente p : pacientesPorNome) {
                        System.out.println(p.toString());
                    }
                }
            }
            case 3 -> {
                System.out.print("Informe o CPF: ");
                String cpfPaciente = Receber.cpf();
                ArrayList<Paciente> pacientesPorCpf = PacienteController.getCpf(cpfPaciente);
                System.out.println("\n----Consulta de Pacientes por CPF----");
                if (pacientesPorCpf.isEmpty()) {
                    System.out.println("\nNão há Pacientes cadastrados com o CPF: " + cpfPaciente + "\n");
                } else {
                    for (Paciente p : pacientesPorCpf) {
                        System.out.println(p.toString());
                    }
                }
            }

            case 4 -> {
                ArrayList<Paciente> pacientesAniversariantesDoMes = PacienteController.getAniversariantes();
                System.out.println("\n----Consulta de Pacientes Aniversariantes do Mês----");
                if (pacientesAniversariantesDoMes.isEmpty()) {
                    System.out.println("\nNão há Pacientes aniversariantes este Mês\n");
                } else {
                    for (Paciente p : pacientesAniversariantesDoMes) {
                        System.out.println(p.toString());
                    }
                }
            }
            case 0 ->
                inicio();
            default -> {
                System.out.println("\nOpção Invalida!!!\n");

            }
        }
    }

    private static void consultaDoutores() {
        System.out.println("\n-----------------------------");
        System.out.println("-----CONSULTA DE DOUTORES-----");
        System.out.println("-----------------------------\n");

        System.out.println("(1) Todos");
        System.out.println("(2) Nome");
        System.out.println("(3) Especialidade");
        System.out.println("(0) Voltar");
        System.out.print("\nInforme a opção desejada: ");

        switch (Receber.inteiro()) {

            case 1 -> {
                ArrayList<Doutor> doutores = DoutorController.getAll();
                System.out.println("\n-------Consulta de Doutores Todos-------");
                if (doutores.isEmpty()) {
                    System.out.println("\nNão há Doutores Cadastrados!!!\n");
                } else {
                    for (Doutor d : doutores) {
                        System.out.println(d.toString());

                    }
                }
            }
            case 2 -> {
                System.out.print("Informe o Nome: ");
                String nomeDoutor = Receber.texto();
                ArrayList<Doutor> doutoresNome = DoutorController.getNome(nomeDoutor);
                System.out.println("\n----Consulta de Doutores por Nome----");
                if (doutoresNome.isEmpty()) {
                    System.out.println("\nNão há Doutores cadastrados com o nome: " + nomeDoutor + "\n");
                } else {
                    for (Doutor d : doutoresNome) {
                        System.out.println(d.toString());

                    }
                }
            }
            case 3 -> {
                System.out.print("Informe a Especialidade: ");
                String especialidade = Receber.texto();
                ArrayList<Doutor> doutoresPorEspec = DoutorController.getEspecialidade(especialidade);
                System.out.println("\n----Consulta de Doutores por Especialidade----");
                if (doutoresPorEspec.isEmpty()) {
                    System.out.println("\nNão há Doutores cadastrados com a Especialidade: " + especialidade + "\n");
                } else {
                    for (Doutor d : doutoresPorEspec) {
                        System.out.println(d.toString());

                    }
                }
            }
            case 0 ->
                inicio();
            default -> {
                System.out.println("\nOpção Invalida!!!\n");

            }
        }
    }

    private static void consultasAgendadas() {
        System.out.println("\n-----------------------------");
        System.out.println("-----CONSULTAS AGENDADAS-----");
        System.out.println("-----------------------------\n");

        System.out.println("(1) Todos");
        System.out.println("(2) Agendada para Hoje");
        System.out.println("(3) Por especialidade");
        System.out.println("(4) Por Paciente");
        System.out.println("(5) Por Doutor");
        System.out.println("(0) Voltar");
        System.out.print("\nInforme a opção desejada: ");

        switch (Receber.inteiro()) {

            case 1 -> {
                ArrayList<ConsultaAgendamento> consultas = ConsultaAgenController.getAll();
                System.out.println("\n----------Consulta-----------");
                if (consultas.isEmpty()) {
                    System.out.println("\nNão há Consultas Agendadas!!!\n");
                } else {
                    for (ConsultaAgendamento c : consultas) {
                        System.out.println(c.toString());

                    }
                }
            }
            case 2 -> {
                ArrayList<ConsultaAgendamento> consultasHoje = ConsultaAgenController.getHoje();
                System.out.println("\n----------Consulta(s) Agendadas para Hoje-----------");
                if (consultasHoje.isEmpty()) {
                    System.out.println("\nNão há consultas agendadas para Hoje!!!\n");
                } else {
                    for (ConsultaAgendamento c : consultasHoje) {
                        System.out.println(c.toString());

                    }
                }
            }
            case 3 -> {
                System.out.print("Informe a Especialidade: ");
                String especialidade = Receber.texto();
                ArrayList<ConsultaAgendamento> consultasPorEsp = ConsultaAgenController.getEspecialidade(especialidade);
                System.out.println("\n----------Consulta(s) Por Especialidade -----------");
                if (consultasPorEsp.isEmpty()) {
                    System.out.println("\nNão há consultas agendadas com está Especialidade!!!\n");
                } else {
                    for (ConsultaAgendamento c : consultasPorEsp) {
                        System.out.println(c.toString());

                    }
                }
            }

            case 4 -> {
                System.out.print("Informe o nome do Paciente: ");
                String nomePaciente = Receber.texto();
                ArrayList<ConsultaAgendamento> consultasPorPaciente = ConsultaAgenController.getPaciente(nomePaciente);
                System.out.println("\n----------Consulta(s) Por Paciente-----------");
                if (consultasPorPaciente.isEmpty()) {
                    System.out.println("\nNão há consultas agendadas com este Paciente!!!\n");
                } else {
                    for (ConsultaAgendamento c : consultasPorPaciente) {
                        System.out.println(c.toString());

                    }
                }
            }
            case 5 -> {
                System.out.print("Informe o nome do Doutor: ");
                String nomeDoutor = Receber.texto();
                ArrayList<ConsultaAgendamento> consultasPorDoutor = ConsultaAgenController.getDoutor(nomeDoutor);
                System.out.println("\n----------Consulta(s) Por Doutor-----------");
                if (consultasPorDoutor.isEmpty()) {
                    System.out.println("\nNão há consultas agendadas com este Doutor!!!\n");
                } else {
                    for (var c : consultasPorDoutor) {
                        System.out.println(c.toString());

                    }
                }
            }
            case 0 ->
                inicio();
            default -> {
                System.out.println("\nOpção Invalida!!!\n");

            }
        }
    }

}
