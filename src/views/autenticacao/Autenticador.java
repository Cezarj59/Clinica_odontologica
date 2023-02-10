package views.autenticacao;

import views.InterfaceLogin;
import views.InterfacePrincipal;
import views.autenticacao.PermitirAcesso;

public class Autenticador {

    public static void autenticar(String login, String senha) {
        PermitirAcesso acesso = new PermitirAcesso();
        acesso.setLogin("admin");
        acesso.setSenha("0000");

        if (acesso.logon(login, senha)) {
            InterfacePrincipal i = new InterfacePrincipal();
            i.setVisible(true);            
        }

    }

    public static void disconect() {
        PermitirAcesso acesso = new PermitirAcesso();
        if (acesso.logof()) {
            InterfaceLogin login = new InterfaceLogin();
            login.setVisible(true);
        }

    }

}
