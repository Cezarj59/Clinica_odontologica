package views;


import javax.swing.JOptionPane;
import controllers.PermitirAcesso;

public class Autenticador {

    public static void autenticar() {
        PermitirAcesso acesso = new PermitirAcesso();
        String login = JOptionPane.showInputDialog("Informe o Login");
        String senha = JOptionPane.showInputDialog("Informe a Senha");

        acesso.setLogin(login);
        acesso.setSenha(senha);

        if (acesso.autenticar()) {

        } else {
            System.err.println("\nSenha ou Login invalidos!!!\n");
            autenticar();
        }
    }

}
