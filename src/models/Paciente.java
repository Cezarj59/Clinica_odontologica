package models;

import java.time.LocalDate;

public class Paciente extends Pessoa {

    private LocalDate nascimento;
    private String cpf;
    private String telefone;
    private String email;

    public Paciente() {
    }

    public Paciente(LocalDate nascimento, String cpf, String telefone, String email, int idPaciente, String nomePaciente) {
        super(idPaciente, nomePaciente);
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    @Override
    public String toString() {
        return "\nPaciente nº: " + getId()
                + "\nNome: " + getNome()
                + "\nData de Nascimento: " + getNascimento()
                + "\nCPF: " + getCpf()
                + "\nTelefone: " + getTelefone()
                + "\nEmail: " + getEmail();
    }

}
