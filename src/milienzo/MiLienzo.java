
package milienzo;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.Timer;

public class MiLienzo extends JPanel implements KeyListener, ActionListener{
    
    Point pSun = new Point(Config.WINDOW_W/2,Config.WINDOW_H/2);
    public MiLienzo (){
        setPreferredSize(new Dimension(Config.WINDOW_W, Config.WINDOW_H));
        setBackground(Color.GRAY);
        Timer timer = new Timer(100,this);
        timer.start();
    }
    
    @Override //Siempre existe este método
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        PaintBrush paintBrush = new PaintBrush(g);
        paintBrush.drawSky();
        
        
        paintBrush.drawMountains(15,120,100,40,180,120);
        paintBrush.drawMountains(180,120,250,40,350,120);
        paintBrush.drawMountains(100,120,175,40,250,100);
        paintBrush.drawTree(200,50);
        paintBrush.drawTree(100,20);
        paintBrush.drawTree(300,40);
        paintBrush.drawTree(50,110);
        paintBrush.drawTree(360,100);
        paintBrush.drawTree(140,75); 

        paintBrush.drawSun(pSun);
    }
    
    @Override
    public void keyPressed(KeyEvent event){
        int key = event.getKeyCode();
        
        if(key == KeyEvent.VK_UP){
            pSun.setY(pSun.getY()-Config.SUN_STEP);
        }
        
        if(key == KeyEvent.VK_DOWN){
            pSun.setY(pSun.getY()+Config.SUN_STEP);
        }
        
        if(key == KeyEvent.VK_RIGHT){
            pSun.setY(pSun.getX()+Config.SUN_STEP);
        }
        
        if(key == KeyEvent.VK_LEFT){
            pSun.setY(pSun.getX()-Config.SUN_STEP);
        }
        
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int x = pSun.getX();
        int y = pSun.getY();
        x=x+1;
        pSun.setX(x);
        y=y+1;
        pSun.setY(y);
        repaint();
        
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
