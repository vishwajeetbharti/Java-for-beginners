package DAA;
import java.util.*;
import static java.lang.System.exit;

class Stack{
    int [] st = new int[10];
    int top=-1;
    int size=5;
    void push(int item){
        if(top==size-1){
            System.out.println("Stack Overflow...");
        }
        else{
            st[++top]=item;
        }
    }
    void pull(){
        if(top==-1){
            System.out.println("Stack is empty...");
        }
        else{
            System.out.println("Item Popped:- "+st[top--]);
        }
    }
    void display(){
        int i;
        if(top==-1){
            System.out.println("Stack is empty...");
        }
        else{
            System.out.println("Stack Contains...");
            for(i=0;i<=top;i++){
                System.out.println(st[i]);
            }
        }
    }
}
public class program2 {
    public static void main(String[] args) {
        Stack Ob =new Stack();
        Scanner take =new Scanner(System.in);
        for(;;){
            System.out.println("Enter the anyone...\n1.Push\n2.Pop\n3.Display\n4.Exit");
            int ch=take.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter the item");
                    int item=take.nextInt();
                    Ob.push(item);
                    break;
                case 2:
                    Ob.pull();
                    break;
                case 3:
                    Ob.display();
                    break;
                case 4:
                    exit(0);
                default:
                    System.out.println("Please enter the valid input...");
            }
        }
    }
}
