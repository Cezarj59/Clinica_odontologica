package models;

import java.time.LocalDateTime;

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

    public void setStatusConsulta(boolean statusConsulta) {
        this.statusConsulta = statusConsulta;
    }

}
