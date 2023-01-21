/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controllers.interfaces;

import java.util.ArrayList;
import models.ConsultaAgendamento;

/**
 *
 * @author cezarj59
 */
public interface iAgendaConsultaController {

    public ConsultaAgendamento agendar();

    public void adicionar(ConsultaAgendamento a);

    public ArrayList<ConsultaAgendamento> getAll();

    public ArrayList<ConsultaAgendamento> getAtivo();

    public ArrayList<ConsultaAgendamento> getHoje();

    public ArrayList<ConsultaAgendamento> getEspecialidade(String especialidade);

    public ArrayList<ConsultaAgendamento> getPaciente(String nome);

    public ArrayList<ConsultaAgendamento> getDoutor(String nome);
}
