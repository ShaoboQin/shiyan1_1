import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

public class GUI extends JFrame{
    Ellipse2D circle;
    public GUI(){
        super("Moving Circle");
        circle = new Ellipse2D.Double(275,275,50,50);
        this.addKeyListener(new myKeyListener(this));
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.white);
        g2.fillRect(0,0,this.getWidth(),this.getHeight());
        g2.setColor(Color.red);
        g2.fill(circle);
    }

    public static void main(String args[]){
        GUI d = new GUI();
    }
    class myKeyListener extends KeyAdapter{
        JFrame frame;
        public myKeyListener(JFrame frame){
            this.frame = frame;
        }
        @Override
        public void keyPressed(KeyEvent e){

            switch(e.getKeyCode()){
                case KeyEvent.VK_UP:
                    circle.setFrame(circle.getX(),circle.getY()-10,circle.getHeight(),circle.getWidth());
                    break;
                case KeyEvent.VK_DOWN:
                    circle.setFrame(circle.getX(),circle.getY()+10,circle.getHeight(),circle.getWidth());
                    break;
                case KeyEvent.VK_LEFT:
                    circle.setFrame(circle.getX()-10,circle.getY(),circle.getHeight(),circle.getWidth());
                    break;
                case KeyEvent.VK_RIGHT:
                    circle.setFrame(circle.getX()+10,circle.getY(),circle.getHeight(),circle.getWidth());
                    break;
            }
            frame.repaint();
        }
    }
}