package views;

import controllers.AgendaConsultaController;
import static controllers.AgendaConsultaController.alteraStatus;
import services.Constante;
import controllers.DoutorController;
import controllers.PacienteController;
import services.Receber;
import static views.Views.*;
import javax.swing.JOptionPane;
import controllers.PermitirAcesso;

public class Menu {

    public static void autenticar() {
        PermitirAcesso acesso = new PermitirAcesso();
        String login = JOptionPane.showInputDialog("Informe o Login");
        String senha = JOptionPane.showInputDialog("Informe a Senha");

        acesso.setLogin(login);
        acesso.setSenha(senha);

        if (acesso.autenticar()) {

            inicio();

        } else {
            System.err.println("\nSenha ou Login invalidos!!!\n");
            autenticar();
        }
    }

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

    protected static void cadastrar() {
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
                Constante.paciente.adicionar(Constante.paciente.cadastrar());

            case 2 ->
                Constante.doutor.adicionar(Constante.doutor.cadastrar());

            case 3 ->
                Constante.agendamento.adicionar(Constante.agendamento.agendar());

            case 0 ->
                inicio();
            default -> {
                System.out.println("\nOpção Invalida!!!\n");

            }
        }
    }

    protected static void consultar() {
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

    protected static void consultaPacientes() {
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

            case 1 ->
                consultaPacienteTodos();
            case 2 ->
                consultaPacienteNome();
            case 3 -> {
                System.out.println("");
                //  consultaPacienteCpf();
            }

            case 4 ->
                consultaPacienteAniversariante();
            case 0 ->
                inicio();
            default -> {
                System.out.println("\nOpção Invalida!!!\n");

            }
        }
    }

    protected static void consultaDoutores() {
        System.out.println("\n-----------------------------");
        System.out.println("-----CONSULTA DE DOUTORES-----");
        System.out.println("-----------------------------\n");

        System.out.println("(1) Todos");
        System.out.println("(2) Nome");
        System.out.println("(3) Especialidade");
        System.out.println("(0) Voltar");
        System.out.print("\nInforme a opção desejada: ");

        switch (Receber.inteiro()) {

            case 1 ->
                consultaDoutoresTodos();
            case 2 ->
                consultaDoutorNome();
            case 3 ->
                consultaDoutorEspecialidade();
            case 0 ->
                inicio();
            default -> {
                System.out.println("\nOpção Invalida!!!\n");

            }
        }
    }

    protected static void consultasAgendadas() {
        alteraStatus();
        System.out.println("\n-----------------------------");
        System.out.println("-----CONSULTAS AGENDADAS-----");
        System.out.println("-----------------------------\n");

        System.out.println("(1) Todos");
        System.out.println("(2) Ativas");
        System.out.println("(3) Agendada para Hoje");
        System.out.println("(4) Por especialidade");
        System.out.println("(5) Por Paciente");
        System.out.println("(6) Por Doutor");
        System.out.println("(0) Voltar");
        System.out.print("\nInforme a opção desejada: ");

        switch (Receber.inteiro()) {

            case 1 ->
                consultaAgendadaTodos();
            case 2 ->
                consultaAgendadaAtivas();
            case 3 ->
                consultaAgendadaHoje();
            case 4 ->
                consultaAgendadaEspecialidade();
            case 5 ->
                consultaAgendadaNomePaciente();
            case 6 ->
                consultaAgendadaNomeDoutor();
            case 0 ->
                inicio();
            default -> {
                System.out.println("\nOpção Invalida!!!\n");

            }
        }
    }

    public static void menuAuxiliar() {
        while (true) {
            System.out.println("\n-----------------------------");
            System.out.println("-----ESCOLHA UMA OPÇÂO-----");
            System.out.println("-----------------------------\n");

            System.out.println("(1) Voltar ao Inicio");
            System.out.println("(2) Cadastrar");
            System.out.println("(3) Consultar");
            System.out.print("\nInforme a opção desejada: ");

            switch (Receber.inteiro()) {
                case 1:
                    inicio();
                    break;
                case 2:
                    cadastrar();
                    break;
                case 3:
                    consultar();
                    break;
                default:
                    System.out.println("\nOpção Invalida!!!\n");

            }
        }

    }
}
