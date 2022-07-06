package DAA;
import java.util.*;

class Students{
    String name;
    String USN;
    String Branch;
    Long Phone;
    public void takedata(){
        Scanner take = new Scanner(System.in);
        System.out.println("Enter the Name,Usn,Branch and Phone of students:-");
        name= take.next();
        USN = take.next();
        Branch = take.next();
        Phone = take.nextLong();
    }
    public void Display(){
        System.out.println("*******************************************");
        System.out.println("Student Name:- "+name);
        System.out.println("Student USN:-"+USN);
        System.out.println("Student Branch:-"+Branch);
        System.out.println("Student Phone:-"+Phone);
        System.out.println("*******************************************");
    }
}
public class Program1 {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of students.");
        n = take.nextInt();
        Students[] s =new Students[n];
        System.out.println("Enter the Students Details:-");
        for(int i=0;i<n; i++){
            s[i]=new Students();
            s[i].takedata();
        }
        System.out.println("*****Students Details*****");
        for (int i=0;i<n;i++){
            s[i].Display();
            System.out.println();
        }
    }
}
