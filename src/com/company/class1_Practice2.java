//Take three numbers from the user and print the greatest number...

package com.company;

import java.util.Scanner;

public class class1_Practice2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Input the 1st number:");
        int num1=input.nextInt();
        System.out.println("Input the 2nd number:");
        int num2=input.nextInt();
        System.out.println("Input the 3rd number:");
        int num3=input.nextInt();

        if(num1>num2)
            if(num1>num3)
                System.out.println("the greatest:"+ num1);

        if(num2>num1)
            if(num2>num3)
                System.out.println("the greatest:"+ num2);

        if(num3>num1)
            if(num3>num2)
                System.out.println("the greatest:"+ num3);

    }
}
