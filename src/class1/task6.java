//Write a program to check if the provided user credentials are valid during login...

package class1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        String _username="sudipto";
        String _password="1234";

        Scanner in=new Scanner(System.in);
        System.out.println("input username:");
        String username=in.next();
        System.out.println("Input password:");
        String password=in.next();

        if(username.equals(_username)&& password.equals(_password)){
            System.out.println("Access granted");
        }
        else{
            System.out.println("Mismatched");
        }


    }
}
