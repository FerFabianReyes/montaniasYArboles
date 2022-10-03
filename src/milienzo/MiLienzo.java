
package milienzo;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;


public class MiLienzo extends JPanel{
    public MiLienzo (){
        setPreferredSize(new Dimension(400, 300));
        setBackground(Color.GRAY);
    }
    
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        PaintBrush paintBrush = new PaintBrush(g);
        paintBrush.drawSky();
        paintBrush.drawMountaing();
        paintBrush.drawTree();
    }

    
}
