import java.util.Scanner;
class Phone{
		public void ring() {
			System.out.println("\n"+"Ringing. . .");
		}
		public void vibrate() {
			System.out.println("Vibrateing...");
		}
		public void call() {
			System.out.println("calling");
		}
	}
	class Square{
		public int area(int a) {
			int b=a*a;
			return b;
		}
		public int perimeter(int a) {
			int b= 4*a;
			return b;
		}
	}
public class Employee {
	String name;
	int salary;
	
	
	public int getsalary() {
		return salary;
	}
	public String getname() {
		return name;
	}
	void setname(String nam) {
		name =nam;
	}

	

	public static void main(String[] args) {
	Employee setu =new Employee();
	// Problem 1.
	setu.setname("Setu Kumar");
	setu.salary=50000;
	System.out.println(setu.getname()+"\n"+setu.getsalary());
	
	
	//Problem 2.
	Phone nokia = new Phone();
	nokia.ring();
	nokia.call();
	nokia.vibrate();
	
	//Problem 3.
	Scanner sc =new Scanner(System.in);
	Square  a1=new Square();
	int side_leangth;
	System.out.println("\n"+"Enter the length of Square.");
	side_leangth= sc.nextInt();
	System.out.println("area of square is:-"+a1.area(side_leangth)+"\n"+"Perimeter of square is:-"+a1.perimeter(side_leangth));
	
	
	}

}
