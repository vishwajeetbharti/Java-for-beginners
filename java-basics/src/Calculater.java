import java.util.*;
public class Calculater {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double num,num1;
		char operator;
		System.out.println("Enter the number:-");
		num =sc.nextDouble();
		System.out.println("Enter the operator:-");
		operator =sc.next().charAt(0);
		System.out.println("Enter the number:-");
		num1 =sc.nextDouble();
		switch(operator){
		case '+':
			System.out.println(num+num1);
		break;
		case '-':
			System.out.println(num-num1);
		break;
		case '*':	
			System.out.println(num*num1);
		break;
		case '/':
			System.out.println(num/num1);
		break;
		default:
		    System.out.println("Error operator.");



		

		}



	}

}
