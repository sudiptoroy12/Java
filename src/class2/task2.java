//Write a program to show range of prime numbers from 2 to n using while loop...

package class2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter  range n for print prime number:");
        int a=2;
        int n=in.nextInt();
        System.out.println("Prime numbers:");
        while(a<n){
            int flag=0;
            for(int i=2;i<=a/2;i++){

                if(a%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(a+" ");
            }
            a++;
        }
    }
}
