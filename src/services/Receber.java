package services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Receber {

    public static String texto() {
        Scanner leia = new Scanner(System.in);

        return leia.nextLine();
    }

   
    public static String cpf() {

        String dados, replaceAll;

        while (true) {

            Scanner leia = new Scanner(System.in);
            dados = leia.nextLine();

            replaceAll = dados.replaceAll("[^0-9]+", "");

            if (replaceAll.length() == 11) {
                break;
            } else {
                System.err.println("CPF invalido, Tente novamente!!!");
                System.out.print("Digite novamente o CPF: ");
            }
        }

        return replaceAll;
    }

    public static String telefone() {

        String dados, replaceAll;

        while (true) {

            Scanner leia = new Scanner(System.in);
            dados = leia.nextLine();

            replaceAll = dados.replaceAll("[^0-9]+", "");

            if (replaceAll.length() == 11) {
                break;
            } else {
                System.err.println("Numero de Celular invalido, Tente novamente!!!");
                System.out.print("Digite novamente o numero com DDD: ");
            }
        }

        return replaceAll;
    }

    public static LocalDate data() {
        LocalDate parseDate = null;
        while (true) {

            try {
                Scanner leia = new Scanner(System.in);
                String dataRecebida = leia.nextLine();

                DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                parseDate = LocalDate.parse(dataRecebida, formatoBr);

                break;
            } catch (Exception ex) {
                System.err.println("\nTente novamente,no seguinte formato: dd/MM/aaaa");
                System.out.print("\nDigite novamente a Data de Nascimento: ");
            }
        }

        return parseDate;
    }

    public static LocalDateTime dataHora() {
        LocalDateTime parseDate = null;
        while (true) {

            try {
                Scanner leia = new Scanner(System.in);
                String dataRecebida = leia.nextLine();

                DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

                parseDate = LocalDateTime.parse(dataRecebida, formatoBr);

                break;
            } catch (Exception ex) {
                System.err.println("\nATENÇÃO FORMATO INVALIDO!!!");
                System.err.println("Utilize o seguinte formato:(dd/MM/aaaa HH:mm), dia/Mês/Ano Horas:Minutos.\"");
                System.err.println("TENTE NOVAMENTE!!!\n");
                System.out.print("Digite novamente a data e hora da consulta: ");
            }
        }

        return parseDate;
    }

    public static int inteiro() {

        int valor = 0;

        while (true) {
            try {
                Scanner leia = new Scanner(System.in);
                valor = leia.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Tente novamente, apenas com números!");
                System.out.print("Informe novamente o valor: ");
            }
        }

        return valor;
    }

    public static double numeroDecimal() {

        double valor = 0;

        while (true) {
            try {
                Scanner leia = new Scanner(System.in);
                valor = leia.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Tente novamente, apenas com números!");
                System.out.print("Informe novamente o valor: ");
            }
        }

        return valor;
    }
}
