import java.util.Scanner;
public class Loan {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int amount =sc.nextInt();
		int remaining=0;
		for(int month=0;month<=2;month++) {
			remaining=amount-amount*10/100;
			amount=remaining;
		}
		System.out.println(remaining);
		sc.close();
	}

}
