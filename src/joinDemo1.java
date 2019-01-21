import com.sun.glass.ui.Size;

import javax.swing.*;
import java.awt.*;

public class joinDemo1 extends JFrame
{
    //继承
    private int x=350, y=50, r=50;

    //初始值
    public joinDemo1()
    {
        super("小图形");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 800);
        this.setVisible(true);
        Thread thread=new Thread(new Graphicss());
        thread.start();
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.blue);
        g.fillOval(x, y, r, r);
    }
    public static void main(String[] args)
    {
        new joinDemo1();
    }

    class Graphicss implements Runnable{
        @Override
        public void run() {
            for (int j = 0; j <= 120; j=j+10) {
                int getHeight =+100;
                if(getHeight<=700) {
                    revalidate();
                    try {
                        Thread.sleep(500);// 当前线程休眠0.5秒

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                y=y+j;
                repaint();


            }

        }
    }
}