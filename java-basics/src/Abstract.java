import java.util.Scanner;
abstract class parent1 {
	public void triangle(int row) {
		System.out.println("Enter the row of triangle.");
		for (int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void square(int size) {
		System.out.println("Enter the size of square.");
		for(int i=0;i<=size;i++) {
			for(int j=0;j<=size;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}

	}
	abstract public void rectanlge(int l,int b);
	
	abstract void piramid(int l);
	
}
class child1 extends parent1{
	public void piramid(int l){
		for (int i=0; i<l; i++)
        {
			for (int j=l-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
                System.out.print("* ");
            }
  	            System.out.println();
        }
	}
	public void rectanlge(int l,int b){
		for(int i=0;i<=l;i++) {
			for(int j=0;j<=b;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
public class Abstract {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//parant1 call= new parant1(); -- error
		child1 call = new child1();
		call.triangle(5);
		System.out.println();
		call.square(5);
		System.out.println();
		call.piramid(5);
		System.out.println();
		call.rectanlge(5,4);
		sc.close();
	}

}
