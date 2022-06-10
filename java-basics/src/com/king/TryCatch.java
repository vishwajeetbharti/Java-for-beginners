package com.king;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =9;
        int b;
        System.out.println("Enter the number to divide\t"+a);
        boolean k= true;
        while(k)
        {
            b= sc.nextInt();
            try
            {
                int c=a/b;
                System.out.println("Answer:- " +c);
                k= false;
            }
            catch (Exception e)
            {
                System.out.println(e);
                System.out.println("Enter the another number.");
            }
        }
    }
}
