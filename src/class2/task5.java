/* 2 numbers will generate randomly and prompt user to input the summation of 2 numbers.
if user inputs the correct answer print"ans is correct"and user will get 1
point.if user inputs wrong ans ,hen user will get 0 points.
Finally after 5 iteration total score will be show.
 */

package class2;

import java.util.Random;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        double n=0;
        double p=0;
        double total_point=0;
        Scanner i=new Scanner(System.in);

        Random random1=new Random();
        Random random2=new Random();
        int r1=random1.nextInt(10)+1;
        int r2=random2.nextInt(10)+1;
        System.out.println("1st number is:"+r1);
        System.out.println("2nd number is:"+r2);
        for(int j=1;j<=5;j++) {

            System.out.println("Input the summation of 2 numbers:" + r1 + "+" + r2 + "=");

            int sum = i.nextInt();
            if (sum == r1 + r2) {
                System.out.println("Answer is correct");
                System.out.println("User will get 1 point");

            } else {
                System.out.println("Wrong!....");
                System.out.println("User will get 0 point");

            }

            String str = "User will get 1 point";
            String str2 = "User will get 0 point";

            str = str.replaceAll("[^\\d]", " ");
            str = str.trim();
            // str = str.replaceAll(" +", " ");
            String[] arr1 = (str.split(" "));

            str2 = str2.replaceAll("[^\\d]", " ");
            str2 = str2.trim();
            //str2 = str2.replaceAll(" +", " ");
            String[] arr2 = (str2.split(" "));
            double point1 = Double.parseDouble(arr1[0]);
            double points2 = Double.parseDouble(arr2[0]);

            n=point1;
            total_point+=n;
            System.out.println("Total point=" + total_point);

        }







    }
}
