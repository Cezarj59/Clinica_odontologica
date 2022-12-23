
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
                System.out.println("Tente novamente,no seguinte formato: dd/MM/aaaa");
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

                DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy, às' hh:mm'h'");

                parseDate = LocalDateTime.parse(dataRecebida, formatoBr);

                break;
            } catch (Exception ex) {
                System.out.println("Tente novamente,no seguinte formato: dd/MM/aaaa");
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
