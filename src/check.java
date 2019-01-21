
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class check {
    public void checking() throws IOException {
        int score = 0;
        int count = 0;
        FileWriter fileWriter = null;

        int i = 30;
        int[] a = new int[20];
        String[] b = new String[i];
        String[] c = new String[i];
        String[] d = new String[i];
        Float[] e = new Float[i];

        Scanner scanner = new Scanner(System.in);
        System.out.println("           ________");
        System.out.println("      😘   |算术中心|   😄");
        System.out.println("          💗———————💗");
        System.out.println(" ______________________________");
        System.out.println("|完成下列题组，请输入数字类型的答案：|");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        for (int p = 0; p < 10; p++) {
            a[p] = (int) (Math.random() * 9000) + 1000;
            //System.out.println("a[p]"+a[p]);
            a[p+10] = (int) (Math.random() * 9000) + 1000;
            //System.out.println("a[p+10]"+a[p+10]);
            b[p] = String.valueOf(a[p]);
            b[p+10] = String.valueOf(a[p+10]);
            c[p] = b[p].substring(0,2) + "." + b[p].substring(2,4);
            d[p] = b[p+10].substring(0,2) + "." + b[p+10].substring(2,4);
            System.out.print(c[p] + "+" + d[p] + " = ");

            //System.out.println((Float.valueOf(a[p]) + Float.valueOf(a[p+10])));
            e[p] = scanner.nextFloat();

            if (Float.valueOf(e[p])*100 ==
                    (Float.valueOf(a[p]) + Float.valueOf(a[p+10]))) {
                try{
                    fileWriter=new FileWriter("D:\\1.txt",true);
                    fileWriter.write(a[p]);
                    fileWriter.write("+");
                    fileWriter.write(a[p+10]);
                    fileWriter.write("=");
                    fileWriter.write(String.valueOf(e[p]));
                    fileWriter.close();

                }
                catch(IOException e1){
                    e1.printStackTrace();
                    System.out.println("文件写入错误");
                    System.exit(-1);
                }

                score += 10;
                count += 1;
                Random ran = new Random();
                int random = ran.nextInt(4) + 1;

                switch (random) {
                    case 1:
                        System.out.println("你太棒了！");
                        break;
                    case 2:
                        System.out.println("你好聪明呀！");
                        break;
                    case 3:
                        System.out.println("厉害啊，你就是未来之星！");
                        break;
                    case 4:
                        System.out.println("棒棒棒！go on！");
                }

                System.out.println();

            } else if (Float.valueOf(e[p])*100 !=
                    (Float.valueOf(a[p]) + Float.valueOf(a[p+10]))){

                int random = 1 + (int) (Math.random() * 4);

                switch (random) {
                    case 1:
                        System.out.println("再考虑考虑！");
                        break;
                    case 2:
                        System.out.println("仍需努力了！");
                        break;
                    case 3:
                        System.out.println("再细心一点哦！");
                        break;
                    case 4:
                        System.out.println("错了，再来一次，加油！加油！");
                }

                System.out.print(c[p] + "+" + d[p] + " = ");
                e[p] = scanner.nextFloat();

                if (Float.valueOf(e[p]) * 100 ==
                        (Float.valueOf(a[p]) + Float.valueOf(a[p+10]))) {

                    try{
                        fileWriter=new FileWriter("D:\\1.txt",true);
                        fileWriter.write(a[p]);
                        fileWriter.write("+");
                        fileWriter.write(a[p+10]);
                        fileWriter.write("=");
                        fileWriter.write(String.valueOf(e[p]));
                        fileWriter.close();

                    }
                    catch(IOException e1){
                        e1.printStackTrace();
                        System.out.println("文件写入错误");
                        System.exit(-1);
                    }

                    score += 10;
                    count += 1;

                    int ran = 1 + (int) (Math.random() * 4);

                    switch (ran) {
                        case 1:
                            System.out.println("你太棒了！");
                            break;
                        case 2:
                            System.out.println("你好聪明呀！");
                            break;
                        case 3:
                            System.out.println("这就对了嘛，你就是未来之星！");
                            break;
                        case 4:
                            System.out.println("棒棒棒！go on！");
                    }

                    System.out.println();

                }else if (Float.valueOf(e[p]) * 100 !=
                        (Float.valueOf(a[p]) + Float.valueOf(a[p+10]))){
                    int ra = 1 + (int) (Math.random() * 4);

                    try{
                        fileWriter=new FileWriter("D:\\1.txt",true);
                        fileWriter.write(a[p]);
                        fileWriter.write("+");
                        fileWriter.write(a[p+10]);
                        fileWriter.write("=");
                        fileWriter.write(String.valueOf(e[p]));
                        fileWriter.close();

                    }
                    catch(IOException e1){
                        e1.printStackTrace();
                        System.out.println("文件写入错误");
                        System.exit(-1);
                    }

                    switch (ra) {
                        case 1:
                            System.out.println("不好意思，又错了！");
                            break;
                        case 2:
                            System.out.println("又错了，以后要细心了！");
                            break;
                        case 3:
                            System.out.println("拒绝粗心大意，才能赢得胜利");
                            break;
                        case 4:
                            System.out.println("第二次错喽，没机会了！");
                    }

                    System.out.println();

                    if (p!=9){
                        int r = 1 + (int) (Math.random() * 4);

                        switch (r) {
                            case 1:
                                System.out.println("开启下一题吧！");
                                break;
                            case 2:
                                System.out.println("新的一道题哦！");
                                break;
                            case 3:
                                System.out.println("试试这个题！");
                                break;
                            case 4:
                                System.out.println("新的一题，相信自己！");
                        }
                    }
                }
            }
        }
        System.out.println("      =============================");
        System.out.println("                   输      ");
        System.out.println("          ~~~~     出     ~~~~");
        System.out.println("         ~~~~~~    处    ~~~~~~");
        System.out.println("        ~💗~~~~~~~~  ~~~~~~~~💗~");
        System.out.println("          ~~~~~~~~~💗~~~~~~~~~");
        System.out.println("             ~~~~~~~~~~~~~~");
        System.out.println("               ~~~~~~~~~~");
        System.out.println("                ~~~~~~~");
        System.out.println("                 ~~~~");
        System.out.println("                  ~~");
        System.out.println("                  💗");
        System.out.println("          ☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀");
        System.out.println("          ☀你答对了" + count + "道加法题。 ☀");
        System.out.println("          ☀你的正确率为 "+(count*10 / 10)*10+" %   ☀");
        System.out.println("          ☀你 的 分 数 是 ：" + score + "!☀");
        System.out.println("          ☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀☀");
    }
}
