import java.util.Scanner;
interface addition{
	public void Addbook(String book);
	public void Showbook();
}
interface Onrent{
	public void Takebook();
	public void Retrunbook();
}
class  books implements addition,Onrent{
	private String[] books;
	private int ID;
	public void libraryList(){
		this.books = new String[100];
		this.ID=1;
	}
	public void Addbook(String book) {
		this.books[ID]=book;
		ID++;
		//System.out.println("Book is added.");
	}
	public void Showbook() {
		for(int iD=1;iD<this.ID;iD++) {
			System.out.println(iD+":- "+this.books[iD]);
		}
	}
	public void Takebook() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Id.");
   	 int id;
   	 id= sc.nextInt();
   	 if(id<=this.ID) {
   		 System.out.println(this.books[id]+" book has been issued");
       	 this.books[id] = null;
       	 while(id<this.ID) {
       		 books[id]=books[id+1];
       		 id=id+1;
       	 }
   	 }
   	 else if(this.ID>=id) {
   		 System.out.println("Invalide Id.");
   	 }
   	 sc.close();
	}
	public void Retrunbook() {
		
	}



}
public class Library {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		books centre = new books();
		centre.libraryList();
//		centre.Addbook("LOVING");
//		centre.Addbook("THE CALL OF THE WILD\r\n"
//				+ "by Jack London");
//		centre.Addbook("ULYSSES\r\n"+ "by James Joyce");
//		centre.Addbook("THE GREAT GATSBY\r\n"+ "by F. Scott Fitzgerald");
//		centre.Addbook("A PORTRAIT OF THE ARTIST AS A YOUNG MAN\r\n"+ "by James Joyce");
//		centre.Addbook("A PASSAGE TO INDIA\r\n"
//				+ "by E.M. Forster");
//		centre.Addbook("THE MAGNIFICENT AMBERSONS\r\n"
//				+ "by Booth Tarkington");
//		centre.Addbook("THE GINGER MAN\r\n"
//				+ "by J.P. Donleavy");
//		centre.Addbook("LOLITA\r\n"+ "by Vladimir Nabokov ");
//		centre.Addbook("BRAVE NEW WORLD\r\n"+ "by Aldous Huxley ");
//		centre.Addbook("THE SOUND AND THE FURY\r\n"+ "by William Faulkner ");
//		centre.Addbook("CATCH-22\r\n"
//				+ "by Joseph Heller ");
//		centre.Addbook("DARKNESS AT NOON\r\n"
//				+ "by Arthur Koestler ");
//		centre.Addbook("SONS AND LOVERS\r\n"
//				+ "by D.H. Lawrence ");
//		centre.Addbook("THE GRAPES OF WRATH\r\n"
//				+ "by John Steinbeck ");
//		centre.Addbook("UNDER THE VOLCANO\r\n"
//				+ "by Malcolm Lowry ");
//		centre.Addbook("THE WAY OF ALL FLESH\r\n"
//				+ "by Samuel Butler ");
//		centre.Addbook("HENDERSON THE RAIN KING\r\n"
//				+ "by Saul Bellow\r\n"
//				+ " ");
//		centre.Addbook("APPOINTMENT IN SAMARRA\r\n"
//				+ "by John O’Hara ");
//		centre.Addbook("U.S.A.(trilogy)\r\n"
//				+ "by John Dos Passos ");
//		centre.Addbook("WINESBURG, OHIO\r\n"
//				+ "by Sherwood Anderson ");
//		centre.Addbook("THE POSTMAN ALWAYS RINGS TWICE\r\n"
//				+ "by James M. Cain ");
//		centre.Addbook("THE SHELTERING SKY\r\n"
//				+ "by Paul Bowles ");
//		centre.Addbook("SOPHIE’S CHOICE\r\n"
//				+ "by William Styron ");
//		centre.Addbook("UNDER THE NET\r\n"
//				+ "by Iris Murdoch ");
//		centre.Addbook("WIDE SARGASSO SEA\r\n"
//				+ "by Jean Rhys ");
//		centre.Addbook("THE MAGUS\r\n"
//				+ "by John Fowles ");
//		centre.Addbook("IRONWEED\r\n"
//				+ "by William Kennedy ");
//		centre.Addbook("TOBACCO ROAD\r\n"
//				+ "by Erskine Caldwell ");
//		centre.Addbook("MIDNIGHT’S CHILDREN\r\n"
//				+ "by Salman Rushdie ");
		String naam;
		naam=sc.next();
		centre.Addbook(naam);
		centre.Showbook();
		centre.Takebook();
		centre.Showbook();
		sc.close();
	}

}
