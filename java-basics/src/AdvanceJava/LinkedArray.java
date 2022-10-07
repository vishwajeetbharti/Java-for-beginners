package AdvanceJava;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.System.exit;

public class LinkedArray {
    public static void main(String[] args) {
        int num;
        Scanner sc =new Scanner(System.in);
        LinkedList<Integer> l2=new LinkedList<>();
        for(;;){
            int choice;
            System.out.println("""
                    1. Insert at first
                    2. Insert at last
                    3. Delete from first
                    4. Delete from last
                    5. Display All
                    6. Is Empty
                    7. Shorting
                    8. Getting First
                    9. Getting Last
                    10. Clear all
                    11. Exit
                    """);
            choice= sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the number to insert");
                    num = sc.nextInt();
                    l2.addFirst(num);
                }
                case 2 -> {
                    System.out.println("Enter the number with index to insert");
                    System.out.print("Number:- ");
                    num = sc.nextInt();
                    l2.addLast(num);
                }
                case 3 -> l2.removeFirst();
                case 4 -> l2.removeLast();
                case 5-> {
                    System.out.println("All lists are:- ");
                    for (Integer integer : l2) {
                        System.out.print(integer + " ");
                    }
                    System.out.println();
                }
                case 6->{
                    if(l2.isEmpty()){
                        System.out.println(true +",it is empty.");
                    }
                    else{
                        System.out.println(false +",it is not empty.");

                    }
                }
                case 7-> Collections.sort(l2);
                case 8-> System.out.println(l2.getFirst());
                case 9-> System.out.println(l2.getLast());
                case 10->l2.clear();
                case 11-> exit(0);
            }
        }
    }
}
