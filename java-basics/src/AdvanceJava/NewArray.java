package AdvanceJava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.exit;


public class NewArray {

    public static void main(String[] args) {
        int num,ind;
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer> l2=new ArrayList<>();
        for(;;){
            int choice;
            System.out.println("1. Insert\n2. Insert at index\n3. Delete from Last\n4. Delete with Index\n5. Display\n6. Is Empty\n7. Shoting\n8. Exit");
            choice= sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the number to insert");
                    num = sc.nextInt();
                    l2.add(num);
                }
                case 2 -> {
                    System.out.println("Enter the number with index to insert");
                    System.out.print("Index:- ");
                    ind = sc.nextInt();
                    System.out.print("Number:- ");
                    num = sc.nextInt();
                    l2.add(ind, num);
                }
                case 3 -> {
                    int val,d1;
                    System.out.println("Enter the Value ");
                    val= sc.nextInt();
                    d1=l2.lastIndexOf(val);
                    l2.remove(d1);
                }
                case 4 ->{
                    System.out.println("Enter the Index");
                    System.out.print("Index:- ");
                    ind= sc.nextInt();
                    l2.remove(ind);
                }
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
                case 8-> exit(0);
            }
        }
    }

}
