package controllers.interfaces;

import java.util.ArrayList;
import models.Paciente;

public interface iPacienteController {

    public Paciente cadastrar();

    public void adicionar(Paciente p);

    public ArrayList<Paciente> getAll();

    public ArrayList<Paciente> getNome(String nome);

    public ArrayList<Paciente> getCpf(String cpf);

    public ArrayList<Paciente> getAniversariantes();
}
