package models;

import java.time.LocalDateTime;

public class ConsultaAgendamento extends Consulta {

    private int idPaciente;
    private int idDoutor;

    private Paciente paciente;
    private Doutor doutor;

    public ConsultaAgendamento() {
    }

    //Construtor Cadastro
    public ConsultaAgendamento(int idPaciente, int idDoutor, int id, LocalDateTime dataHoraConsulta, double valorConsulta, boolean statusConsulta) {
        super(id, dataHoraConsulta, valorConsulta, statusConsulta);
        this.idPaciente = idPaciente;
        this.idDoutor = idDoutor;
    }

    //Construtor Consulta
    public ConsultaAgendamento(Paciente paciente, Doutor doutor, int id, LocalDateTime dataHoraConsulta, double valorConsulta, boolean statusConsulta) {
        super(id, dataHoraConsulta, valorConsulta, statusConsulta);
        this.paciente = paciente;
        this.doutor = doutor;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doutor getDoutor() {
        return doutor;
    }

    public void setDoutor(Doutor doutor) {
        this.doutor = doutor;
    }

    


    @Override
    public String toString() {
        return "\n\n########################################"
                + "\n\nCONSULTA AGENDADA Nº: " + getId()
                + "\n" + getPaciente().toString()
                + "\n" + getDoutor().toString()
                + "\n---------------------------"
                + "\nDATA DA CONSULTA: " + getDataHoraConsultaFormated()
                + "\nVALOR: R$" + getValorConsulta()
                + "\nSTATUS: " + (isStatusConsulta() ? "Agendada" : "Consulta Expirada");
    }

}
