package com.king;
import java.util.*;
import java.lang.Math;
class cal{
    public void area(int b){
        int areas=4*b;
        System.out.println("area is " + areas);
    }
    public void cirm(int b){
        int cirm=b*4;
        System.out.println("Circumfrence is " + cirm);
    }
}
public class Package1 {
    public static void main(String[] args) {
        int c;
   System.out.println("I am from main class.");
   cal ar =new cal();
   ar.area(5);
   ar.cirm(6);
    }
}
