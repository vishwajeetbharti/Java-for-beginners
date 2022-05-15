package com.king;
class Mythread0 extends Thread{
    public void run(){
        while(true){
            System.out.println("I am talking with GF.-thread1-");
        }
    }
}
class Mythread1 extends Thread{
    public void run(){
        while(true){
            System.out.println("I am cooking.-thread2-");
        }
    }
}
public class Threading {
    public static void main(String[] args) {
        Mythread0 a1 = new Mythread0();
        Mythread1 a2 = new Mythread1();
        a1.start();
        a2.start();
    }
}
