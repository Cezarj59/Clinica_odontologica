package services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Receber {

    public static String cpf(String cpf) {

        String replaceAll;

        replaceAll = cpf.replaceAll("[^0-9]+", "");

        if (replaceAll.length() == 11) {

        } else {
            JOptionPane.showMessageDialog(null, "CPF invalido, Tente novamente!!!");
            return "0";
        }

        return replaceAll;
    }

    public static String telefone(String telefone) {

        String dados, replaceAll;

        dados = telefone;

        replaceAll = dados.replaceAll("[^0-9]+", "");

        if (replaceAll.length() == 11) {

        } else {
            JOptionPane.showMessageDialog(null, "Numero de Celular invalido, Tente novamente!!!");
        }

        return replaceAll;
    }

    public static LocalDate data(String data) {
        LocalDate parseDate = null;
        try {

            String dataRecebida = data;

            DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            parseDate = LocalDate.parse(dataRecebida, formatoBr);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, " Data no Formato Errado!!!"
                    + "\nTente novamente, no seguinte formato: dd/MM/aaaa");

        }

        return parseDate;
    }

    public static LocalDateTime dataHora(String data, String hora) {
        LocalDateTime parseDate = null;

        try {
            DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

            parseDate = LocalDateTime.parse(data + " " + hora, formatoBr);

            if (LocalDateTime.now().isBefore(parseDate)) {
                return parseDate;
            } else {
                JOptionPane.showMessageDialog(null, "Não é possível agendar uma data anterior à agora."
                        + "\nDigite uma data ou horário válido!!! ");

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Formato de Data ou Hora Inválido!!!");

        }

        return parseDate;
    }

    public static int inteiro() {

        int valor = 0;

        try {
            Scanner leia = new Scanner(System.in);
            valor = leia.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Tente novamente, apenas com números!");
            System.out.print("Informe novamente o valor: ");
        }

        return valor;
    }

    public static double numeroDecimal(String n) {
        double valor = 0;

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (Character.isLetter(c)) {
                JOptionPane.showMessageDialog(null, "Digite apenas numeros no campo Valor.");
                return 0;
            }

        }

        if (!n.equals("")) {
            valor = Double.parseDouble(n);
        }

        return valor;
    }
}
