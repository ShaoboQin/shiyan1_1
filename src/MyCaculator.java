package caculator;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author HJY
 * @date 2018.11.16
 */
public class MyCaculator {
    public static void main(String[] args)throws IOException  {
        FileWriter fw=null;
        Scanner scanner=new Scanner(System.in);
        int rate=0;
        System.out.println("******欢迎使用计算器******");
        System.out.println("你好，请进行题目数量选择：");
        int amount=scanner.nextInt();
        System.out.println("你好，请进行错误改正次数选择：");
        int times=scanner.nextInt();
        System.out.println("******************************************");
        System.out.println("测试开始，按任意键退出");
        long startTime = System.currentTimeMillis();
        for(int cout=1;cout<=amount;cout++){
            System.out.println("第"+cout+"题:");
            double x=(Math.random() * 100) ;
            double y=(Math.random() * 100) ;
            String x1=String.valueOf(x);
            String y1=String.valueOf(y);
            String x2=x1.substring(0,5);
            String y2=y1.substring(0,5);
            System.out.print(x2+"+"+y2+"=");
            String answer1=scanner.next();
            double answer2=Double.valueOf(answer1);
            double a=Double.valueOf(x2);
            double b=Double.valueOf(y2);
            double r1=a+b;
            String r2=String.valueOf(r1);
            String r3;
            try{
                fw=new FileWriter("D:\\Record.txt",true);
                fw.write(x2);
                fw.write("+");
                fw.write(y2);
                fw.write("=");
                fw.close();

            }
            catch(IOException e1){
                e1.printStackTrace();
                System.out.println("文件写入错误");
                System.exit(-1);
            }


            if (r1>100||a<10||b<10) {
                r3=r2.substring(0,6);
            } else {
                r3=r2.substring(0,5);
            }

            double r4=Double.valueOf(r3);


            if(r4==answer2){
                System.out.println("恭喜你，答案正确！");
                rate++;
            }
            else
            {
                System.out.println("给你个机会重新组织语言-_-|||");
                int t=0;
                while(t<times)
                {
                    answer1=scanner.next();
                    answer2=Double.valueOf(answer1);
                    if(r4==answer2)
                    {
                        System.out.println("答对了！");
                        t=times;
                        rate++;

                    }
                    if(r4!=answer2&&t!=times-1) {
                        System.out.println("再试试-_-|||");
                    }
                    t++;
                }
            }
            System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆结果◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
        }
        scanner.close();
        long endTime   = System.currentTimeMillis();
        long TotalTime = endTime - startTime;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("                                                   答题完毕");
        System.out.println("                              花费时间为"+TotalTime/ 1000+"秒");
        System.out.println("                             你一共答了"+amount+"道题,答对"+rate+"道题。");
        System.out.println("                             你的正确率为："+((double)rate/amount)*100+"%。");

    }
}
