package views.autenticacao;

import javax.swing.JOptionPane;

public class PermitirAcesso implements iLogin {

    private String login;
    private String senha;

    public PermitirAcesso() {
    }

    public PermitirAcesso(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean logon(String login, String senha) {

        if (getLogin().equals(login) && getSenha().equals(senha)) {
            JOptionPane.showMessageDialog(null, "Conta conectada!!!");

            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Login ou senha inválido!!!");
            return false;
        }

    }

    @Override
    public boolean logof() {
        JOptionPane.showMessageDialog(null, "Desconectado!!!");
        return true;
    }
}
