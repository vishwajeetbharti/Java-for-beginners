package com.king;
class IThreadRunnable0 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(i<100){
            System.out.println("I am thread 0.");
        }
    }
}
class IThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(i<100){
            System.out.println("I am thread 1.");
        }
    }
}
public class Runable_interface {
    public static void main(String[] args) {
           IThreadRunnable0 water0 = new IThreadRunnable0();
           Thread tab0 = new Thread(water0);
           IThreadRunnable1 water1 = new IThreadRunnable1();
           Thread tab1 = new Thread(water1);
           tab0.start();
           tab1.start();
    }
}
