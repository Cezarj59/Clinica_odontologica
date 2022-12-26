package models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public abstract class Consulta {

    private int id;
    private LocalDateTime dataHoraConsulta;
    private double valorConsulta;
    private boolean statusConsulta;

    public Consulta() {
    }

    public Consulta(int id, LocalDateTime dataHoraConsulta, double valorConsulta, boolean statusConsulta) {
        this.id = id;
        this.dataHoraConsulta = dataHoraConsulta;
        this.valorConsulta = valorConsulta;
        this.statusConsulta = statusConsulta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataHoraConsulta() {
        return dataHoraConsulta;
    }

    public String getDataHoraConsultaFormat() {

        DateTimeFormatter formatoBr = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        return formatoBr.format(dataHoraConsulta);

    }

    public void setDataHoraConsulta(LocalDateTime dataHoraConsulta) {
        this.dataHoraConsulta = dataHoraConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public boolean isStatusConsulta() {
        return statusConsulta;
    }

    public String verificaStatusConsulta() {
        return (statusConsulta) ? "Agendada" : "Consulta Expirada";

    }

    public void setStatusConsulta(boolean statusConsulta) {
        this.statusConsulta = statusConsulta;
    }

}
