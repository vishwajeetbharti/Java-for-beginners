import java.util.Random;
public class Random_number {

	public static void main(String[] args) {
		Random rand =new Random();
		int random= 10;
		float minimum =10,maximum=12;
		int integer = rand.nextInt(random);
		System.out.println("Random integer value between 0 to 10:-\n"+ integer);
		float float_random =minimum + rand.nextFloat() * (maximum - minimum);
		System.out.println("Random integer value between 0 to 10:-\n"+ float_random);
        
	}

}
