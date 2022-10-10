import java.util.Scanner;
class  opreater{
	private float value1,value2;
	public float output;
	
	public void setinput(float userinput) {
		value1 =userinput;
	}
	
	public void setinput2(float userinput) {
		value2 =userinput;
	}
	public void output1() {
		System.out.println(output);
		//return output;
	}
	
	public void output(char operator) {
		switch (operator) {
			case '+' -> {
				output = value1 + value2;
				value1 = 0;
				value1 = output;
			}
			case '-' -> {
				output = value1 - value2;
				value1 = 0;
				value1 = output;
			}
			case '*' -> {
				output = value1 * value2;
				value1 = 0;
				value1 = output;
			}
			case '/' -> {
				output = value1 / value2;
				value1 = 0;
				value1 = output;
			}
		}
	}
}
public class calc {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		opreater User = new opreater();
		float userInput;
		char operat;
		boolean A = true,k=true;
		System.out.println("Calculator Started:-");
		userInput = sc.nextFloat();
		
		do {
			//System.out.println("jjj");
			operat =sc.next().charAt(0);
		switch(operat){
		case '+':
			if(A) {
				User.setinput(userInput);
				userInput=0;
				//System.out.println("Enter the 2nd number:-");
				userInput = sc.nextFloat();
				User.setinput2(userInput);
				userInput=0;
				User.output('+');
				A= false;
			}
			else {
				userInput = sc.nextFloat();
				User.setinput2(userInput);
				userInput=0;
				User.output('+');
			}
		break;
		case '-':
			if(A) {
				User.setinput(userInput);
				userInput=0;
				userInput = sc.nextFloat();
				User.setinput2(userInput);
				User.output('-');
				A= false;
			}
			else {
				userInput = sc.nextFloat();
				User.setinput2(userInput);
				userInput=0;
				User.output('-');
			}
			
		break;
		case '*':
			if(A) {
				User.setinput(userInput);
			userInput=0;
			userInput = sc.nextFloat();
			User.setinput2(userInput);
			User.output('*');
			A= false;
		}	
			else {
				userInput = sc.nextFloat();
				User.setinput2(userInput);
				userInput=0;
				User.output('*');
			}
			
		break;
		case '/':
			if(A) {
				User.setinput(userInput);
				userInput=0;
				userInput = sc.nextFloat();
				User.setinput2(userInput);
				User.output('/');
				A= false;
			}
			else {
				userInput = sc.nextFloat();
				User.setinput2(userInput);
				userInput=0;
				User.output('/');
			}
			
		break;
		case 'e':
			User.output1();
			k = false;
			break;
		default:
		    System.out.println("Error operator.");
		sc.close(); 
		}
	} while(k);
         
	}

}

