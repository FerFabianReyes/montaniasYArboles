
package milienzo;
import javax.swing.*;
import java.awt.Color;

public class swing {
     public static void main (String args[]){
        JFrame window = new JFrame("Swing");
        Color color = new Color(255,0,0);
        MiLienzo canvas = new MiLienzo();  

        window.setBackground(Config.COLOR_BG);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(Config.WINDOW_W, Config.WINDOW_H);
        window.add(canvas);
        window.pack();
        window.setResizable(false); 
        window.setLocationRelativeTo(null); 
        window.setVisible(true);
        
        window.addKeyListener(canvas);
    }
}
