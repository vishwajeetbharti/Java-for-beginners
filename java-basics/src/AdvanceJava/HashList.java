package AdvanceJava;

import java.util.HashSet;
import java.util.Scanner;

import static java.lang.System.exit;

public class HashList {
    public static void main(String[] args) {
        int num;
        Scanner sc =new Scanner(System.in);
        HashSet<Integer> l2=new HashSet<>();
        for(;;){
            int choice;
            System.out.println("1. Insert\n2. Clear all element\n3. Searching\n4. Display\n5. Is Empty\n6. Size\n7. Remove by object\n8. Exit");
            choice= sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the number to insert");
                    num = sc.nextInt();
                    l2.add(num);
                }
                case 2 -> l2.clear();
                case 3 -> {
                    System.out.println("Enter the element to be searched.");
                    int val= sc.nextInt();
                    System.out.println(l2.contains(val));
                }
                case 4 -> System.out.println(l2);
                case 5-> System.out.println(l2.isEmpty());
                case 6-> System.out.println(l2.size());
                case 7-> {
                    System.out.println("Enter the value to remove");
                    int del= sc.nextInt();
                    l2.remove(del);
                }
                case 8-> exit(0);
            }
        }
    }
}
