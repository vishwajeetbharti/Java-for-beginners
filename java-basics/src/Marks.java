import java.util.*;
public class Marks {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("You can calculate here percentage of marks:-");
		Double science,math,english,sscience,hindi;
		Double percentage;
		Double total;
		System.out.println("Enter the marks of science:-");
		science = sc.nextDouble();
		System.out.println("Enter the marks of math:-");
		math = sc.nextDouble();
		System.out.println("Enter the marks of english:-");
		english = sc.nextDouble();
		System.out.println("Enter the marks of social science:-");
		sscience = sc.nextDouble();		
		System.out.println("Enter the marks of hindi:-");
		hindi = sc.nextDouble();
		total=science+math+english+sscience+hindi;
		percentage=100*total/500;
		System.out.println("Total marks you got "+total);
		System.out.println("Total marks percentage is:"+ percentage);
		if(science<33||math<33||english<33||sscience<33||hindi<33)
		{
			System.out.println("Compt:");
		}
		else
		{
			System.out.println("Pass:");
		}
	}

}
