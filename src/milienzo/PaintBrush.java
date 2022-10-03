
package milienzo;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class PaintBrush {
    private Graphics g;
    private static final Color COLOR_Mountaing = new Color(49, 71, 78);
    private static final Color COLOR_BROWN = new Color (102,74,43);
    private static final Color COLOR_TREE = new Color (56,127,69);
    
    public PaintBrush(Graphics g){
        this.g = g;
    }
    
    public void drawSky(){
        g.setColor(new Color (112,185, 250));
        g.fillRect(0, 0, 400, 100);
        g.setColor(new Color (250,203, 112));
        g.fillOval(36, 36, 30, 30);
        g.setColor(Color.YELLOW);
        g.fillOval(40, 40, 20, 20);
        
    }
    
    public void drawMountaing(){
        Polygon triangle = new Polygon();
        triangle.addPoint(15, 120);
        triangle.addPoint(100, 40);
        triangle.addPoint(180, 120);
        g.setColor(COLOR_Mountaing);
        g.fillPolygon(triangle);
    }
    
    public void drawTree(){
        int start = 200;
        int top = 50;
        
        g.setColor(COLOR_BROWN);
        g.fillRect(start, top, 26, 40);
        //g.fillRect(start-10, top+110, 26, 40);
        
        g.setColor(COLOR_TREE);
        for(int i=0; i<5; i++){
            Polygon triangle = new Polygon();
            int heigth =50;
            int width = 70;
            int spacing = 15;
            
            triangle.addPoint(start, top + (spacing * i));
            triangle.addPoint(start - (width/2), top + heigth + (spacing*i));
            triangle.addPoint(start + (width/2), top + heigth + (spacing*i));
            
            g.fillPolygon(triangle);
        }
    }
}
