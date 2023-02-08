package views;

import java.awt.Color;
import javax.swing.UIManager;
import services.AplicaNimbusLookAndFeel;

public class Main {

    public static void main(String[] args) {
        AplicaNimbusLookAndFeel.pegaNimbus();
        UIManager.put("nimbusBase", new Color(51, 153, 255));
        InterfacePrincipal i = new InterfacePrincipal();
        i.setVisible(true);

    }

}
