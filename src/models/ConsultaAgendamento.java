package models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ConsultaAgendamento extends Consulta {

    private Paciente dadosPaciente;
    private Doutor dadosDoutor;

    public ConsultaAgendamento() {
    }

    public ConsultaAgendamento(int id, LocalDateTime dataHoraConsulta, double valorConsulta, boolean statusConsulta) {
        super(id, dataHoraConsulta, valorConsulta, statusConsulta);
    }

    public ConsultaAgendamento(LocalDate nascimento, String cpf, String telefone, String email, int idPaciente, String nomePaciente, String cro, String especialidade, int id, String nomeDoutor, int idDoutor, LocalDateTime dataHoraConsulta, double valorConsulta, boolean statusConsulta) {
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

    @Override
    public String toString() {
        return "Consulta Agendada nº: " + getId()
                + "Paciente: " + dadosPaciente.toString()
                + "Doutor: " + dadosDoutor.toString()
                + "Data: " + getDataHoraConsulta()
                + "Valor: " + getValorConsulta()
                + "Status: " + isStatusConsulta();
    }

}
