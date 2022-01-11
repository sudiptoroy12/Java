//Write a program to sum of digits of a number by taking from user input...

package class2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int m,sum=0;
        Scanner i= new Scanner(System.in);
        System.out.println("Enter a digits:");
        int n=i.nextInt();
        while(n>0){
            m=n%10;
            sum+=m;
            n=n/10;
        }
        System.out.println("Sum of digits:"+ sum);


    }
}
