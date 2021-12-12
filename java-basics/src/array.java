import java.util.*;
public class array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int marks[]  = {32,23,34,34,43};//Declare + Initialize
		for(int i=0;i<marks.length;i++)
		System.out.println(marks[i]);
		System.out.println(marks.length);

		int[] score;// Declaration.
		score = new int[5];// Allocation.
		System.out.println("Enter the score");
		for(int i=0;i<score.length;i++)
			score[i]=sc.nextInt();
		for(int i=0;i<marks.length;i++)
			System.out.println(score[i]);
		System.out.println(score.length);
		sc.close();
	}
	

}
