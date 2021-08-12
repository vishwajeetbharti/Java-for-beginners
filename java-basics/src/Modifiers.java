import java.util.Scanner;
class private_modifier{
	private int Roll;
	private String Name;
	
	public void setid(int a) {
		Roll=a;
	}
	public void getid() {
		System.out.println(Roll);
	}
	public void setname(String n) {
		Name=n;
	}
	public void getname() {
		System.out.println(Name);
	}
}
public class Modifiers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i;
		String na;
		System.out.println("Enter the id and name.");
		i =sc.nextInt();
		na = sc.next();
		//private_modifier Vishwajeet =new private_modifier; we can't acess this because that is private memory.
        //Vishwajeet.setid=111;
		//Vishwajeet.setname=("Vishwajeet Bharti");
		private_modifier Vishwajeet =new private_modifier();
		Vishwajeet.setid(i);
		Vishwajeet.setname(na);
		Vishwajeet.getid();
		Vishwajeet.getname();
		sc.close();
	}

}
