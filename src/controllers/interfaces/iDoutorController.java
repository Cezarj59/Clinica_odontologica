package controllers.interfaces;

import java.util.ArrayList;
import models.Doutor;

public interface iDoutorController {

    public Doutor cadastrar(String nome, String cro, String especialidade);

    public void adicionar(Doutor d);

    public ArrayList<Doutor> getAll();

    public ArrayList<Doutor> getNome(String nome);

    public ArrayList<Doutor> getEspecialidade(String especialidade);
}
