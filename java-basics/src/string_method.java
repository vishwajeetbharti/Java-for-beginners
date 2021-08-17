import java.util.*;
public class string_method {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name,lower,upper,tr,sh,sh2,re;
		System.out.println("Enter your name:-");
		name = sc.nextLine();
		int value = name.length();
		System.out.println("1:-" + value);
		lower =name.toLowerCase();
		System.out.println("2:-"+lower);
		upper =name.toUpperCase();
		System.out.println("3:-"+upper);
		tr =name.trim();
		System.out.println("5:-"+tr);
		sh =name.substring(2);
		System.out.println("6:-"+sh);
		sh2 =name.substring(0,2);
		System.out.println("7:-"+sh2);
		re =name.replace('y','v');
		System.out.println("8:-"+re);
		System.out.println("9:-"+name.startsWith("yu"));
		System.out.println("10:-"+name.endsWith("ar"));
		System.out.println("11:-"+name.charAt(2));
		System.out.println("13:-"+name.indexOf(0,'s'));
		sc.close();
		
	}

}
