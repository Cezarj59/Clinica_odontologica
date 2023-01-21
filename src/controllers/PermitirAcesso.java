package controllers;

import controllers.interfaces.iPermitirAcesso;

public class PermitirAcesso implements iPermitirAcesso {

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
    public boolean autenticar() {
        return login.equals("admin") && senha.equals("admin");
    }
}
