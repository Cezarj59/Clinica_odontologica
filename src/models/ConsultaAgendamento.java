package models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ConsultaAgendamento extends Consulta {

    private Paciente dadosPaciente;
    private Doutor dadosDoutor;
    private int idPaciente;
    private int idDoutor;

    public ConsultaAgendamento() {
    }

    public ConsultaAgendamento(int id, LocalDateTime dataHoraConsulta, double valorConsulta, boolean statusConsulta) {
        super(id, dataHoraConsulta, valorConsulta, statusConsulta);
    }

    //Construtor Cadastro
    public ConsultaAgendamento(int idPaciente, int idDoutor, int id, LocalDateTime dataHoraConsulta, double valorConsulta, boolean statusConsulta) {
        super(id, dataHoraConsulta, valorConsulta, statusConsulta);
        this.idPaciente = idPaciente;
        this.idDoutor = idDoutor;
    }

    //Construtor Consulta
    public ConsultaAgendamento(LocalDate nascimento, String cpf, String telefone, String email, int idPaciente, String nomePaciente, String cro, String especialidade, int idDoutor, String nomeDoutor, int id, LocalDateTime dataHoraConsulta, double valorConsulta, boolean statusConsulta) {
        super(id, dataHoraConsulta, valorConsulta, statusConsulta);
        this.dadosPaciente = new Paciente(nascimento, cpf, telefone, email, idPaciente, nomePaciente);
        this.dadosDoutor = new Doutor(cro, especialidade, idDoutor, nomeDoutor);
    }

    public Paciente getDadosPaciente() {
        return dadosPaciente;
    }

    public void setDadosPaciente(Paciente dadosPaciente) {
        this.dadosPaciente = dadosPaciente;
    }

    public Doutor getDadosDoutor() {
        return dadosDoutor;
    }

    public void setDadosDoutor(Doutor dadosDoutor) {
        this.dadosDoutor = dadosDoutor;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdDoutor() {
        return idDoutor;
    }

    public void setIdDoutor(int idDoutor) {
        this.idDoutor = idDoutor;
    }

    @Override
    public String toString() {
        return "Consulta Agendada nº: " + getId()
                + "\n" + dadosPaciente.toString()
                + "\n" + dadosDoutor.toString()
                + "\n---------------------------"
                + "\nData: " + getDataHoraConsulta()
                + "\nValor: " + getValorConsulta()
                + "\nStatus: " + isStatusConsulta();
    }

}
