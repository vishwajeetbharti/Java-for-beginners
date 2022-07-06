package DAA;
import java.util.*;
class Staff{
    String StafId,Name;
    Long Salary,phone;
    Scanner take= new Scanner(System.in);
    void Read(){
        System.out.println("Enter the Staff Id:");
        StafId=take.nextLine();
        System.out.println("Enter the name:");
        Name= take.nextLine();
        System.out.println("Enter the Salary:");
        Salary = take.nextLong();
        System.out.println("Enter the phone number:");
        phone=take.nextLong();
    }
    void display(){
        System.out.println("\nSTAFFID:- "+StafId);
        System.out.println("Name:- "+Name);
        System.out.println("Salary:- "+Salary);
        System.out.println("Phone:- "+phone);
    }
}
class Teaching extends Staff{
    String Domain,Publication;
    void Read_teaching(){
        super.Read();
        System.out.println("Enter Domain:- ");
        Domain= take.next();
        System.out.println("Enter hte Publication:- ");
        Publication=take.next();
    }
    void display(){
        super.display();
        System.out.println("Domain:- "+Domain);
        System.out.println("Publication:- "+Publication);
    }
}
class Technical extends Staff{
    String skill;
    void read_Technical(){
        super.Read();
        System.out.println("Enter the Skill:- ");
        skill=take.next();
    }
    void display(){
        super.display();
        System.out.println("Sill:- "+skill);
    }
}
class Contract extends Staff{
    String Period;
    void read_Contract(){
        super.Read();
        System.out.println("Enter the Period:- ");
        Period=take.next();
    }
    void display(){
        super.display();
        System.out.println("Period:- "+Period);
    }
}
public class program3 {
    public static void main(String[] args) {
        int i;
        Scanner take =new Scanner(System.in);
        System.out.println("Enter the number of Staff details to be created...");
        int n= take.nextInt();
        Teaching[] steach =new Teaching[n];
        Technical[] stech =new Technical[n];
        Contract[] scon =new Contract[n];
        for(i=0;i<n;i++){
            System.out.println("Enter teaching staff information...");
            steach[i] =new Teaching();
            steach[i].Read_teaching();
        }
        for(i=0;i<n;i++){
            System.out.println("Enter the Technical staff information...");
            stech[i]=new Technical();
            stech[i].read_Technical();
        }
        for(i=0;i<n;i++){
            System.out.println("Enter the Contract staff information...");
            scon[i]=new Contract();
            scon[i].read_Contract();
        }
        System.out.println("\nSTAFF DETAILS: \n");
        System.out.println("----TEACHING STAFF DETAILS----");
        for(i=0;i<n;i++){
            steach[i].display();
        }
        System.out.println();

        System.out.println("----TEACHNICAL STAFF DETAILS----");
        for(i=0;i<n;i++){
            stech[i].display();
        }
        System.out.println();

        System.out.println("----CONTRACT STAFF DETAILS----");
        for(i=0;i<n;i++){
            scon[i].display();
        }
        take.close();
    }
}
