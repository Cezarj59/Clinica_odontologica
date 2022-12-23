package views;

import controllers.ConsultaAgenController;
import controllers.DoutorController;
import controllers.PacienteController;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.MatchResult;
import services.Receber;

public class Main {

    public static void main(String[] args) {
      
     ConsultaAgenController.addConsulta(ConsultaAgenController.agendar());

      
    }

}
