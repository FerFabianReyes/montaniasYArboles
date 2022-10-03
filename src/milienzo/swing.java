
package milienzo;
import javax.swing.*;
import java.awt.Color;

public class swing {
     public static void main (String args[]){
        JFrame window = new JFrame("Swing");
        Color color = new Color(255,0,0);
        MiLienzo canvas = new MiLienzo();   //Draw ton canvas

        window.setBackground(Color.GRAY);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.add(canvas);
        window.pack();
        window.setResizable(false); 
        window.setLocationRelativeTo(null); 
        window.setVisible(true);
    }
}
