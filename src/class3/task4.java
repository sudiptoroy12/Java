//Write a program to generate random number from 1 to 10 but print by it's alphabetic version...

package class3;

import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        while(true)
        {
            System.out.println("press 1 to continue...");
            System.out.println("press 2 to exit...");
            int p=i.nextInt();
            switch(p)
            {
                case 1:
                    System.out.println("The random number is:");
                    Random random= new Random();
                    int n=random.nextInt(10)+1;
                   // System.out.println(n);
                    String w[]={" ","one","two","three","four","five","six","seven","eight","nine","ten"};
                    System.out.println(w[n]);
                    break;
                case 2:
                    System.exit(0);

            }
        }


    }
}
