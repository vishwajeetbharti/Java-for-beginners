package AdvanceJava;
import java.util.ArrayDeque;

public class Name
{
    public static void main(String[] args) {
        ArrayDeque<Integer>y1=new ArrayDeque<>();
        y1.add(10);
        y1.add(12);
        y1.add(20);
        System.out.println(y1.getFirst());
        System.out.println(y1.getLast());

    }
}