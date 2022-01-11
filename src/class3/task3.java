//Find max and min number from a given array...

package class3;

import java.util.Arrays;

public class task3 {

    public static void getMaxValue(int [] array,int totalLength){
       int a[]={ 2,4,5,7,8,8,2,0,0,1,15,4,9};
        Arrays.sort(a);
        System.out.println("Max val is=" +a[a.length-1]);
    }
    public static void getMinValue(int [] array,int totalLength){
        int a[]={ 2,4,5,7,8,8,2,0,0,1,15,4,9};
        Arrays.sort(a);
        System.out.println("Min val is=" +a[0]);
    }



    public static void main(String[] args) {

        int a[]={ 2,4,5,7,8,8,2,0,0,1,15,4,9};
        getMaxValue(a,13);
        getMinValue(a,13);

    }
}
