
package milienzo;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class PaintBrush {
    private Graphics g;
    
    public PaintBrush(Graphics g){
        this.g = g;
    }
    
    public void drawSky(){
        g.setColor(new Color (112,185, 250));
        g.fillRect(0, 0, 400, 100);
       
        
    }
     
    public void drawSun(Point p){
        g.setColor(Config.SET_COLOR);
        g.fillOval(p.getX(), p.getY(), Config.SUN_SIZE, Config.SUN_SIZE);
        
    }
     
       public void drawMountains(int x1,int y1,int x2,int y2,int x3,int y3) {
        Polygon triangle = new Polygon();
        triangle.addPoint(x1,y1);
        triangle.addPoint(x2,y2);
        triangle.addPoint(x3,y3);
        g.setColor(Config.COLOR_Mountaing);
        g.fillPolygon(triangle);
    }
    
    
        public void drawTree(int start,int top) {
 
        g.setColor(Config.COLOR_BROWN);
        g.fillRect(start-10, top+110, 26, 40);

        g.setColor(Config.COLOR_TREE);
        for(int i=0; i < 5; i++ ){
            Polygon triangle = new Polygon();
            int height = 50;
            int width = 70;
            int spacing = 15;

            triangle.addPoint(start, top + (spacing * i));
            triangle.addPoint(start - (width/2), top + height + (spacing*i));
            triangle.addPoint(start + (width/2), top + height + (spacing*i));

            g.fillPolygon(triangle);
        }
    }
}
