//Write a program to sum of random numbers...

package class1;

import java.util.Random;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        Random random1=new Random();
        Random random2=new Random();
        int r1=random1.nextInt(50)+1;
        int r2=random2.nextInt(50)+1;

        int sum=r1+r2;

        System.out.println(r1 + "+"+r2 + "sum is :" +sum);


    }
}
