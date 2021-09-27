interface Student{
	String name ="Vishwajeet Bharti";
	String USN= "1AM20IS111";
	void works(int rows);
	void Id();
}
interface Student1{
	String name1 ="Yukthi";
	String USN1= "1AM20IS112";
	void works1(int n);
	void Id1();
}	
class File implements Student,Student1{
    public void works(int rows) {
    	for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void Id() {
         System.out.println("https://www.linkedin.com/in/vishwajeet-bharti-11923516a/");	
    }
    public void works1(int n) {
    	for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {
                System.out.print(" ");
            }
            int C = 1;
            for (int i = 1; i <= line; i++) {
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }
    public void Id1() {
    	System.out.println("https://www.linkedin.com/in/yukthi-j-achar-069778201/");
    }
}
public class _Interfaces_ {

	public static void main(String[] args) {
        File A1 = new File();
        System.out.println(A1.name+"\n"+A1.USN);
        A1.Id();
        A1.works(5);
        System.out.println(A1.name1+"\n"+A1.USN1);
        A1.Id1();
        A1.works1(5);
	}

}
