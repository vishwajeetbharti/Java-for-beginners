package AdvanceJava;

import java.util.Calendar;
import java.util.Date;

public class Print_date {
    public static void main(String[] args) {
        Date d= new Date();
        Date d1 = new Date(122, Calendar.OCTOBER,9);
        System.out.println(d);
        System.out.println(d1);

        System.out.println("Today is "+d.compareTo(d1));//Both Date are same It will print '1' otherwise '-1'.....
        // print date month year
        System.out.println("The current date is : "+ d.getDate());
        System.out.println("The current date is : "+ d.getMonth());
        System.out.println("The current year is : "+ (1900+d.getYear()));//need to  1900 to show current year
    }
}
