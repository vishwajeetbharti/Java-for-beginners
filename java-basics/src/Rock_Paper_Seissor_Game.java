import java.util.Random;
import java.util.*;
public class Rock_Paper_Seissor_Game {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random rand =new Random();
		boolean user=false;
		char a=0,input=0;
		String character="SPR";
		while(user==false)
		{
			a=character.charAt(rand.nextInt(character.length()));
			//System.out.println(a);
			System.out.println("Start Game.\nEnter first capital letter from any of them:-\n1:-Scissors.\n2:-Paper.\n3:-Rock.");
			input= sc.next().charAt(0);
			if(input==a)
			{
				System.out.println("Computer choose: "+a);
				System.out.println("You choose: "+ input);
				System.out.println("Both are same.");
				user=false;
			}
			else if(a=='S'&& input=='P')
			{
				System.out.println("Computer choose: "+a);
				System.out.println("You choose: "+ input);
			    System.out.println("You lose the mathch.");
			    user=true;
			}
			else if(a=='P'&& input=='S')
			{
				System.out.println("Computer choose: "+a);
				System.out.println("You choose: "+ input);
				System.out.println("You won the mathch.");
			     user=true;
			}
			else if(a=='R'&& input=='P')
			{
				System.out.println("Computer choose: "+a);
				System.out.println("You choose: "+ input);
				System.out.println("You won the mathch.");
			     user=true;
			}
			else if(a=='P'&& input=='R')
			{
				System.out.println("Computer choose: "+a);
				System.out.println("You choose: "+ input);
				System.out.println("You lose the mathch.");
			     user=true;
			}
			else if(a=='R'&& input=='S')
			{
				System.out.println("Computer choose: "+a);
				System.out.println("You choose: "+ input);
				System.out.println("You lose the mathch.");
			     user=true;
			}
			else if (a=='S'&& input=='R')
			{
				System.out.println("Computer choose: "+a);
				System.out.println("You choose: "+ input);
				System.out.println("You won the mathch.");
			     user=true;
			}
			
		}
		System.out.println("Game End.");
		sc.close();
	}
}
