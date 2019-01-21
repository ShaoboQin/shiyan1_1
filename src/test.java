import javax.swing.*;
import java.awt.*;

public class test extends JFrame {
    int x = 300;
    int y = 50;
    boolean judge1 = true;
    boolean judge2 = true;
//    boolean judge = true;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setColor(Color.red);
        g.fillOval(x, y, 60, 60);
//        if(judge) {
//            y = y + 10;
//        }else {
//            y = y - 10;
//        }
//        if(y>600-60){
//            judge = false;
//        }
//        if(y<60){
//            judge = true;
//        }



        if (y < 60) {
            judge1 = true;
        }
        if (y > (600 - 60)) {
            judge1 = false;
        }
        if(judge1){
            y = y + 10;
        }else{
            y = y - 10;
        }
        if (x < 60) {
            judge2 = true;
        }
        if (x > 660 - 60) {
            judge2 = false;
        }
        if(judge2){
            x = x + 10;
        }else {
            x = x - 10;
        }
    }
    public void range() {
        setBounds(200,200,660,600);
        setVisible(true);
        while(true){
            repaint();
            try{
                Thread.sleep(50);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        test game = new test();
        game.range();
    }

}
