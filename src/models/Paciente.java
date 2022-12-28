package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Objects;

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

    public String getNascimentoFormatadoBR() {

        DateTimeFormatter formatoBr = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        return formatoBr.format(nascimento);
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
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paciente other = (Paciente) obj;
        return Objects.equals(this.cpf, other.cpf);
    }

   
    
    
    @Override
    public String toString() {
        return "--------------------------"
                + "\nPaciente nº: " + getId()
                + "\nNome: " + getNome()
                + "\nData de Nascimento: " + getNascimentoFormatadoBR()
                + "\nCPF: " + getCpf()
                + "\nTelefone: " + getTelefone()
                + "\nEmail: " + getEmail();
    }

}
