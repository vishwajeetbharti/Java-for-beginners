import java.util.Scanner;

public class VarArgs {
	static int sum(int ...arr) {
		int ans=0;
		for (int a: arr) {
			ans +=a;
		}
		return ans;
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System .in);
		System.out.println("Enter the number to add regular.");
		int[] num;
		num =new int[5];
		for(int i=0;i<5;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println(sum(num));
		sc.close();
		
		
		
		

	}

}
