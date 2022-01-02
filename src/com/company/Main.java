package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();


        if (num >=0) {
            System.out.println("the number is positive.");

        }
        else{
            System.out.println("the number is negative.");
        }




    }
}
