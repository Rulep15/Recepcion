package prgs;

import formulario.*;
import org.jvnet.substance.SubstanceLookAndFeel;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class inicio 
{ 
    public static void main(String[] args) 
    {  
            menu.setDefaultLookAndFeelDecorated(true);
            SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlackSteelSkin"); //GreenMagic
           //SubstanceLookAndFeel.setCurrentTheme("org.jvnet.substance.theme.SubstanceEbonyTheme");
           //SubstanceLookAndFeel.setCurrentWatermark("org.jvnet.substance.watermark.SubstanceMetalWallWatermark");
            SubstanceLookAndFeel.setCurrentButtonShaper("org.jvnet.substance.button.StandardButtonShaper");
            SubstanceLookAndFeel.setCurrentGradientPainter("org.jvnet.substance.painter.SpecularWaveGradientPainter");
            //new acceso().setVisible(true);
            new Thread(new Splash()).start();    
     }
    
     public static String inicial = "si";
}
