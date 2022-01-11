//Write a program to make a digital tasbih where the program counts each time user press enter until 0..

package class2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

import static java.lang.System.*;

public class task3 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Input a number:");

        while(true) {
            int n = in.nextInt();
            for (int i=1; i <= 10; i++) {
               // int n = in.nextInt();
                System.out.printf("%d * %d = %d \n", n, i, (n * i));

            }
            if (n == 0) {
                System.out.println("exit");
                break;
            }
        }
    }
}
