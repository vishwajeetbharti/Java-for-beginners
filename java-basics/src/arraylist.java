import java.util.ArrayList;
import java.util.List;

public class arraylist {
	public static void main(String[] args) {
		 String string = "vishwajeet bharti";
		  
	        List<Character> chars = new ArrayList<>();
	  
	        for (char ch : string.toCharArray()) {
	  
	            chars.add(ch);
	        }
	  
	        System.out.println(chars);
	}
}
