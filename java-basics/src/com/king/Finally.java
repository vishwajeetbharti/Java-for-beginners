package com.king;

public class Finally {
    public static void main(String[] args) {
        int a =50;
        int b =10;
        int k=10;
        boolean j=false;
        while(k>=-1)
        {
            try
            {
                int c=a/b;
                System.out.println("Answer:- " +c);
                k--;
            }
            catch (Exception e)
            {
                j=true;
                System.out.println(e);
            }
            finally {
                if(j){
                    System.out.println("Not divided");
                    j=false;
                }
                else {
                    System.out.println("Divided");
                }
            }
            b--;
        }
    }
}


/*
OutPut----


Answer:- 5
Divided
Answer:- 5
Divided
Answer:- 6
Divided
Answer:- 7
Divided
Answer:- 8
Divided
Answer:- 10
Divided
Answer:- 12
Divided
Answer:- 16
Divided
Answer:- 25
Divided
Answer:- 50
Divided
java.lang.ArithmeticException: / by zero
Not divided
Answer:- -50
Divided
Answer:- -25
Divided
 */
