package models;

public class Doutor extends Pessoa {

    private String cro;
    private String especialidade;

    public Doutor() {
    }

    public Doutor(String cro, String especialidade, int idDoutor, String nomeDoutor) {
        super(idDoutor, nomeDoutor);
        this.cro = cro;
        this.especialidade = especialidade;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override

    public String toString() {
        return "---------------------------"
                + "\nDoutor nº: " + getId()
                + "\nNome: " + getNome()
                + "\nCRO: " + getCro()
                + "\nEspecialidade(s): " + getEspecialidade();
    }

}
