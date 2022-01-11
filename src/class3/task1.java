//write a program to calculate the difference between today and your birthday..

package class3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class task1 {
    public static void main(String[] args) throws ParseException {
        String myBirthDay="04/10/1997 03:49:00 PM";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        Date date1=simpleDateFormat.parse(myBirthDay);
        Date date2= new Date();
        long d = date2.getTime() - date1.getTime();
        long year = d / (1000l * 60 * 60 * 24 * 365);
        long day = d / (1000 * 60 * 60 * 24) % 365;
        long hour = (d / (1000 * 60 * 60)) % 24;
        long minutes = (d / (1000 * 60)) % 60;
        long second = (d / 1000) % 60;
        System.out.println("Year " + year);
        System.out.println("Day " + day);
        System.out.println("Hour " + hour);
        System.out.println("Minute " + minutes);
        System.out.println("Second " + second);

    }
}
