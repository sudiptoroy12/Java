//Write a program to check balance and withdraw money from ATM booth using if else...

package class1;

import java.util.Scanner;

public class task8 {
    public static void displayBalance(int balance)
    {
        System.out.println("balance:" +balance);
        System.out.println();
    }

    public static int amountWithdrawing(int balance,int withdrawAmount)
    {
        System.out.println("Withdraw amount:"+ withdrawAmount);
        if (balance >=withdrawAmount){
            balance=balance-withdrawAmount;
            System.out.println("Please collect your money......");
            displayBalance(balance);
        }
        else{
            System.out.println("Sorry insufficient balance....");
        }
        return balance;
    }
    public static void main(String[] args) {
        int balance=15000;
        Scanner i=new Scanner(System.in);
        System.out.println("enter withdraw amount:");
        int withdrawAmount=i.nextInt();
        displayBalance(balance);
        balance=amountWithdrawing(balance,withdrawAmount);

    }
}
