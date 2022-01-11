//Write a program to find if any element is duplicate .If duplicate ,show the value....

package class3;

public class task2 {
    public static void main(String[] args) {
        int[] array=new int[]{ 2,4,5,7,8,8,2,0,0,1,3,4,9};
        System.out.println("Duplicate elements in given array:");

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j])
                    System.out.println(array[j]);
            }
        }
    }
}
