/*1 piece sharee 3500 tk,2 piece shirt 2000 tk and 1 piece pant 750 tk .
    Find total price and total quantity using regular expression...*/

package class2;

public class task4 {
    public static void main(String[] args) {
        String str="1 piece sharee 3500 tk";
        String str1="2 piece shirt 2000 tk";
        String str2="1 piece pant 750 tk";

        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr=(str.split(" "));

        str1 = str1.replaceAll("[^\\d]", " ");
        str1 = str1.trim();
        str1 = str1.replaceAll(" +", " ");
        String[] arr1=(str1.split(" "));

        str2 = str2.replaceAll("[^\\d]", " ");
        str2 = str2.trim();
        str2 = str2.replaceAll(" +", " ");
        String[] arr2=(str2.split(" "));

        double price=Double.parseDouble(arr[1]);
        double price1=Double.parseDouble(arr1[1]);
        double price2=Double.parseDouble(arr2[1]);
        double total_price=price+price1+price2;


        double quantity=Double.parseDouble(arr[0]);
        double quantity1=Double.parseDouble(arr1[0]);
        double quantity2=Double.parseDouble(arr2[0]);
        double total_quantity=quantity+quantity1+quantity2;


        System.out.println("Total price "+total_price);
        System.out.println("Total quantity "+total_quantity);
    }

}
