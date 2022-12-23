package views;

import controllers.ConsultaAgenController;
import controllers.DoutorController;

public class Main {

    public static void main(String[] args) {
       // DoutorController.addDoutor(DoutorController.cadastrar());
        System.out.println(ConsultaAgenController.retornaIdDoutor("Francisco", "Restauração"));
        
    }
}
