package com.king;


class vishaThr extends Thread{
    public vishaThr(String name){
        super(name);
    }
    public void run() {
        int i=0;
        System.out.println("Id:- "+getId()+" I am thread. "+getName() + " with Priority of " + getPriority());
//        while(i<100){
//            System.out.println("I am thread."+i);
//            i++;
//        }
    }
}
public class Thread_name_id {
    public static void main(String[] args) {
       vishaThr a1 = new vishaThr("Vishwajeet");
//       a1.start();
//       System.out.println("The thread Id is:-"+ a1.getId());
//       System.out.println("The thread name is:-" + a1.getName());

        vishaThr a2 = new vishaThr("Yukthi");
//        a2.start();
//        System.out.println("The thread Id is:-"+ a2.getId());
//        System.out.println("The thread name is:-" + a2.getName());

        vishaThr a3 = new vishaThr("Chandan Kumar");
//        a3.start();
//        System.out.println("The thread Id is:-"+ a3.getId());
//        System.out.println("The thread name is:-" + a3.getName());

        vishaThr a4 = new vishaThr("Pullavi");
//        a4.start();
//        System.out.println("The thread Id is:-"+ a4.getId());
//        System.out.println("The thread name is:-" + a4.getName());

/*   *     let set the priority...
     *     For max_Priority Thread.MAX_PRIORITY=10...
     *     For normal By default It has normal Priority=5...
     *     For Min_Priority Thread.MIN_PRIORITY=1...
     *     ~Its also depends upon the processor
*/
        a1.setPriority(Thread.MIN_PRIORITY);
        a2.setPriority(Thread.MAX_PRIORITY);
        a3.setPriority(Thread.MIN_PRIORITY);
        a4.setPriority(Thread.NORM_PRIORITY);
//        System.out.println(a1.getPriority());
//        System.out.println(a2.getPriority());
//        System.out.println(a3.getPriority());
//        System.out.println(a4.getPriority());
        a1.start();
        a2.start();
        a3.start();
        a4.start();


    }
}

/*
* OUTPUT
* Id:- 18 I am thread. Pullavi with Priority of 5
* Id:- 17 I am thread. Chandan Kumar with Priority of 1
* Id:- 16 I am thread. Yukthi with Priority of 10
* Id:- 15 I am thread. Vishwajeet with Priority of 1
*/
