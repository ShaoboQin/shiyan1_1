import java.awt.*;
import javax.swing.*;
public class Guitest extends Thread{
    public static void main(String[] args) {
        JFrame frm=new JFrame();
        PaintFrame pf=new PaintFrame();
        pf.launchFrame(frm);
        frm.add(pf);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Thread th=new Thread(pf);
        th.start();
        frm.setVisible(true);
    }
}
class PaintFrame extends Panel implements Runnable {
    int y=50;
    @Override
    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.red);
        g.fillOval(150,y, 30, 30);
    }
    public void launchFrame(JFrame frm) {
        frm.setBounds(300,300,400,600);
        frm.setVisible(true);
    }
    @Override
    public void run(){
        while(true){
            if(y<300){
                y++;
            }
            else{ y=0;}
        }
    }
}
