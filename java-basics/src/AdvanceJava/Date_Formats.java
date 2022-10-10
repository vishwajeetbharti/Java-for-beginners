package AdvanceJava;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Formats {
    public static void main(String[] args) {
        LocalDateTime dt =LocalDateTime.now();
        DateTimeFormatter bf = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter bf2= DateTimeFormatter.ofPattern("dd/MM/yyy");
        DateTimeFormatter bf3= DateTimeFormatter.ofPattern("yyyy/dd/MM");

        String myDate = dt.format(bf);
        System.out.println(myDate);
        String myDate1 = dt.format(bf2);
        System.out.println(myDate1);
        String myDate2= dt.format(bf3);
        System.out.println(myDate2);
    }
}
