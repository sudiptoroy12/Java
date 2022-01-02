//Write a program to calculate CGPA and find grade...

package com.company;

import java.util.Scanner;

public class class1_Practice5 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("Enter marks=");
        double marks=i.nextDouble();

        if(marks >=80){
            System.out.println("Grade A+");
        }
        else if(marks<80 && marks >=75){
            System.out.println("Grade A");
        }
        else if(marks<75 && marks >=70){
            System.out.println("Grade B+");
        }
        else if(marks<70 && marks >=65){
            System.out.println("Grade B");
        }
        else if(marks<65 && marks >=60){
            System.out.println("Grade B-");
        }
        else if(marks<60 && marks >=55){
            System.out.println("Grade C");
        }
        else if(marks<55 && marks >=50){
            System.out.println("Grade C-");
        }
        else if(marks<50 && marks >=45){
            System.out.println("Grade D");
        }
        else if(marks<45 && marks >=40){
            System.out.println("Grade E");
        }
        else {
            System.out.println("Grade F");
        }

    }
}
