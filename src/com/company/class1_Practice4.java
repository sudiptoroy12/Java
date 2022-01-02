//Write a program to check if inputted letter is small or capital..

package com.company;

import java.util.Scanner;

public class class1_Practice4 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.println("Input a letter:");
        char letter=i.next().charAt(0);

        if (Character.isUpperCase(letter)){
            System.out.println("Inputted letter is capital");
        }
        else{
            System.out.println("Inputted letter is small");
        }

    }
}
