package views;

import controllers.ConsultaAgenController;
import controllers.DoutorController;
import controllers.PacienteController;
import java.util.ArrayList;
import models.Doutor;
import models.Paciente;
import services.Receber;

class Menu {

    protected static void inicio() {
        while (true) {
            System.out.println("\n-----------------------------");
            System.out.println("-----CLINICA ODONTOLÓGICA------");
            System.out.println("-----------------------------\n");

            System.out.println("(0) #SAIR#");
            System.out.println("(1) Cadastrar");
            System.out.println("(2) Consultar");
            System.out.print("Informe a opção desejada: ");

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
                    ;
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
        System.out.print("Informe a opção desejada: ");

        switch (Receber.inteiro()) {

            case 1:
                PacienteController.addPaciente(PacienteController.cadastrar());
                break;
            case 2:
                DoutorController.addDoutor(DoutorController.cadastrar());
                break;
            case 3:
                ConsultaAgenController.addConsulta(ConsultaAgenController.agendar());
                break;
            default:
                System.out.println("\nOpção Invalida!!!\n");
                ;
        }
    }

    private static void consultar() {
        System.out.println("\n-----------------------------");
        System.out.println("----------CONSULTA-----------");
        System.out.println("-----------------------------\n");

        System.out.println("(1) Pacientes");
        System.out.println("(2) Doutores");
        System.out.println("(3) Consultas Agendadas");
        System.out.print("Informe a opção desejada: ");

        switch (Receber.inteiro()) {

            case 1:
                consultaPacientes();
                break;
            case 2:
                consultaDoutores();
                break;
            case 3:

                break;

            default:
                System.out.println("\nOpção Invalida!!!\n");
                ;
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
        System.out.print("Informe a opção desejada: ");

        switch (Receber.inteiro()) {

            case 1:
                ArrayList<Paciente> pacientes = PacienteController.getAll();
                System.out.println("\n----------Pacientes-----------");
                if (pacientes.isEmpty()) {
                    System.out.println("\nNão há Pacientes Cadastrados!!!\n");
                } else {
                    for (Paciente p : pacientes) {
                        System.out.println(p.toString());

                    }
                }
                break;
            case 2:
                System.out.print("Informe o Nome: ");
                String nomePaciente = Receber.texto();
                ArrayList<Paciente> pacientesPorNome = PacienteController.getNome(nomePaciente);
                System.out.println("\n----------Pacientes-----------");
                if (pacientesPorNome.isEmpty()) {
                    System.out.println("\nNão há Pacientes cadastrados com o nome: " + nomePaciente + "\n");
                } else {
                    for (Paciente p : pacientesPorNome) {
                        System.out.println(p.toString());
                    }
                }
                break;
            case 3:
                System.out.print("Informe o CPF: ");
                String cpfPaciente = Receber.cpf();
                ArrayList<Paciente> pacientesPorCpf = PacienteController.getCpf(cpfPaciente);
                System.out.println("\n----------Pacientes-----------");
                if (pacientesPorCpf.isEmpty()) {
                    System.out.println("\nNão há Pacientes cadastrados com o CPF: " + cpfPaciente + "\n");
                } else {
                    for (Paciente p : pacientesPorCpf) {
                        System.out.println(p.toString());
                    }
                }
                break;

            case 4:
                System.out.println("Não está pronto ainda!!!");
                break;
            default:
                System.out.println("\nOpção Invalida!!!\n");
                ;
        }
    }

    private static void consultaDoutores() {
        System.out.println("\n-----------------------------");
        System.out.println("-----CONSULTA DE DOUTORES-----");
        System.out.println("-----------------------------\n");

        System.out.println("(1) Todos");
        System.out.println("(2) Nome");
        System.out.println("(3) Especialidade");
        System.out.print("Informe a opção desejada: ");

        switch (Receber.inteiro()) {

            case 1:
                ArrayList<Doutor> doutores = DoutorController.getAll();
                System.out.println("\n----------Pacientes-----------");
                if (doutores.isEmpty()) {
                    System.out.println("\nNão há Doutores Cadastrados!!!\n");
                } else {
                    for (Doutor d : doutores) {
                        System.out.println(d.toString());

                    }
                }
                break;
            case 2:
                System.out.print("Informe o Nome: ");
                String nomeDoutor = Receber.texto();
                ArrayList<Doutor> doutoresNome = DoutorController.getNome(nomeDoutor);
                System.out.println("\n----------Pacientes-----------");
                if (doutoresNome.isEmpty()) {
                    System.out.println("\nNão há Doutores cadastrados com o nome: " + nomeDoutor + "\n");
                } else {
                    for (Doutor d : doutoresNome) {
                        System.out.println(d.toString());

                    }
                }
                break;
            case 3:
                System.out.print("Informe a Especialidade: ");
                String especialidade = Receber.texto();
                ArrayList<Doutor> doutoresPorEspec = DoutorController.getEspecialidade(especialidade);
                System.out.println("\n----------Pacientes-----------");
                if (doutoresPorEspec.isEmpty()) {
                    System.out.println("\nNão há Doutores cadastrados com a Especialidade: " + especialidade + "\n");
                } else {
                    for (Doutor d : doutoresPorEspec) {
                        System.out.println(d.toString());

                    }
                }
                break;

            default:
                System.out.println("\nOpção Invalida!!!\n");
                ;
        }
    }

}
