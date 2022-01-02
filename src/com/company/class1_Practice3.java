//Write a program that takes a year from user and print whether that year ia a leap year or not...

package com.company;

import java.util.Scanner;

public class class1_Practice3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=input.nextInt();
        if((( year % 4 == 0)&& (year % 100!= 0)) ||( year % 400 == 0))
            System.out.println("The year is a leap year.");
        else
            System.out.println("The year is not a leap year" );


    }
}
