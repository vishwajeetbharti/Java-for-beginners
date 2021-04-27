import java.util.*;
public class triangle {

	public static void main(String[] args) {
		
		int i=4;
		for(int n=0; n<i; n++)
		{
			for(int j=0; j<n+1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		pattern1();
	}
	public static void pattern1() {
		Scanner sc= new Scanner(System.in);
		int sum=0;
		int n;
		System.out.println("Enter the number:-");
		n =sc.nextInt();
		sc.close();
		for(int i=0;i<=n;i++) {
		sum = sum + i;
			
		}
		System.out.println(sum);
		
	}

}
