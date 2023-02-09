package views;

import java.awt.Color;
import javax.swing.UIManager;
import services.AplicaNimbusLookAndFeel;

public class LookAndFell {

    public void Nimbus() {
        AplicaNimbusLookAndFeel.pegaNimbus();
        UIManager.put("nimbusBase", new Color(51, 153, 255));
    }
}
