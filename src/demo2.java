
import java.io.IOException;
import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) throws IOException {
        for (int q = 0; q == 0; ) {

            check check = new check();
            check.checking();
            System.out.println();
            System.out.println(" ***************************************");
            System.out.println(" *****输入任意数字继续计算，输入0退出系统*****");
            System.out.println(" ***************************************");

            Scanner p = new Scanner(System.in);
            int f = p.nextInt();

            switch (f) {

                case 0:
                    q += 1;
            }
        }
    }
}


