import org.omg.IOP.TAG_JAVA_CODEBASE;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Random;

public class demo1 {
    public static void main(String[] args) {
        for (int q = 0; q == 0; ) {
            String a;
            String b;
            String c;
            float d;
            NumberFormat nf = NumberFormat.getNumberInstance();
            nf.setMaximumFractionDigits(2);

            Scanner p = new Scanner(System.in);
            int score = 0;//定义分数
            int count = 0;//定义题数
            int wrong = 0;//定义错误个数
            Boolean tj = true;//定义条件

            for (int i = 0; i < 10; i++) {

                do {
                    i++;
                    a = nf.format( 10 + Math.random() * 90);
                    b = nf.format( 10 + Math.random() * 90);
                    d = Float.parseFloat(a) + Float.parseFloat(b);
                    System.out.print(a + "+" + b + " = ");
                    c = nf.format(p.nextFloat() );

                    if (c.equals(d)){
                        if(i<=10){
                        score += 10;
                        count += 1;
                        Random ran = new Random();
                        int random = ran.nextInt(4) + 1;
                        //int random = 1 + (int)(Math.random()*4);
                        switch (random) {
                            case 1:
                                System.out.println("你太棒了！");
                                break;
                            case 2:
                                System.out.println("你好聪明呀！");
                                break;
                            case 3:
                                System.out.println("继续努力，你就是未来之星！");
                                break;
                            case 4:
                                System.out.println("棒棒棒！go on！");
                        }
                    }else{
                            System.out.println("你已经完成了所有题目，请查看成绩！");
                            System.out.println();
                            tj=false;
                        }
                    }else{
                        do {
                            if (i<=10) {
                                ++wrong;
                                if (wrong <= 1) {
                                    Random random1 = new Random();
                                    int rando = random1.nextInt(4) + 1;
                                    //int random = 1 + (int)(Math.random()*4);
                                    switch (rando) {
                                        case 1:
                                            System.out.println("没关系，还有机会！");
                                            break;
                                        case 2:
                                            System.out.println("再来一次，要细心哦！");
                                            break;
                                        case 3:
                                            System.out.println("再来一次，别灰心！");
                                            break;
                                        case 4:
                                            System.out.println("认真点，你可以的！再算一次！");
                                    }
                                }
                                if (wrong < 2) {
                                    d = Float.parseFloat(a) + Float.parseFloat(b);
                                    System.out.print(a + "+" + b + " = ");
                                    c = nf.format(p.nextFloat());
                                    continue;
                                }

                                if (c.equals(d)) {
                                    Random ran = new Random();
                                    int random = ran.nextInt(4) + 1;
                                    //int random = 1 + (int)(Math.random()*4);
                                    switch (random) {
                                        case 1:
                                            System.out.println("终于对了，你太棒了！");
                                            break;
                                        case 2:
                                            System.out.println("终于对了，你好聪明呀！");
                                            break;
                                        case 3:
                                            System.out.println("终于对了，你就是未来之星！");
                                            break;
                                        case 4:
                                            System.out.println("终于对了，棒棒棒！go on！");
                                    }
                                } else {
                                    int random = 1 + (int) (Math.random() * 4);

                                    switch (random) {
                                        case 1:
                                            System.out.println("太遗憾了，你被扣分了！");
                                            break;
                                        case 2:
                                            System.out.println("仍需努力了，你又错了！");
                                            break;
                                        case 3:
                                            System.out.println("第二次又错了！得多加练习了！");
                                            break;
                                        case 4:
                                            System.out.println("你又错了！");
                                    }
                                }
                            }}while(wrong<=1);
                    }
                }while (tj);


                System.out.println();
                System.out.println("^~~~~~~~~~~查看分数~~~~~~~~~~~^");
                System.out.println("        你答对了" + count + "道加法题");
                System.out.println("        你的分数是：" + score + "分!  ");
                System.out.println("^~~~~~~~~~~~~~~~~~~~~~~~~~~~~^");

                System.out.println("*****输入任意数字继续计算，输入0退出系统*****");
                Scanner e = new Scanner(System.in);
                int f = e.nextInt();

                switch (f) {

                    case 0:
                        q += 1;
                }
            }
        }
    }
}




