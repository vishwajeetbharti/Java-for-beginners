package AdvanceJava;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;

public class Local_Date {
    public static void main(String[] args) {
        Clock d=Clock.systemDefaultZone();
        System.out.println(d.getZone());
        LocalDate b = LocalDate.now();
        System.out.println(b);
        LocalTime c=LocalTime.MAX;
        LocalTime m=LocalTime.MIN;
        LocalTime r=LocalTime.now();
        System.out.println(r);
        System.out.println(m);
        System.out.println(c);
    }
}
