package services;

public class Acesso implements iPermitirAcesso {

    private String login;
    private String senha;

    public Acesso() {
    }

    public Acesso(String login, String senha) {
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
