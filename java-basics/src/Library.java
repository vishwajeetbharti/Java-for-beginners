import java.util.Scanner;
interface addition{
	public void Addbook(String book);
	public void Showbook();
	public void Takebook();
	public void Retrunbook();
	public void issuedBook(int l,String d);
	public void Show();
}

class  books implements addition{
	Scanner sc =new Scanner(System.in);
	private String[] books= new String[10];
	private int ID=-1;
	public String[] done= new String[10];
	public int p;
	
	
	public void Addbook(String book) {
		ID++;
		books[ID]=book;
//		System.out.println(books[--Enter any id to check book name.--]);
//		System.out.println("Book is added.");
	}
	public void Showbook() {
		if(this.ID==-1) {
			System.out.println("Library store is empty.\n___Sorry___");
		}
		else {
			System.out.println("Id no.");
			for(int iD=0;iD<=this.ID;iD++) {
				if (this.books[iD]==null) {
			        continue;
			      }
				System.out.println(iD+"        "+":- "+this.books[iD]);
			}
		}
		
	}
	public void Takebook() {
		System.out.println("Enter the Id.");
   	 int id;
   	 id= sc.nextInt();
   	 if(id<=this.ID) {
   		 System.out.println(this.books[id]+" Book has been issued.\nNote:- Remember the id when will you return this book.");
   		issuedBook(id,this.books[id]);
       	 this.books[id] = null;
       	 
//       	 while(id<this.ID) {
//       		 books[id]=books[id+1];
//       		books[id+1]=null;
//       		 id=id+1;
//       	 }
   	 }
   	 else if(this.ID<id) {
   		 System.out.println("Invalide Id.");
   	 }
	}
	public void Retrunbook() {
		int k;
		System.out.println("Enter the id of book.");
		k =sc.nextInt();
		this.books[k]=this.done[k];
		System.out.println("Successfully returned.");
	}
	public void issuedBook(int l,String d) {
		this.p=l;
		this.done[p]=d;
	}
	public void Show() {
			for(int j=0;j<=10;j++) {
				if (this.done[j]==null) {
			        continue;
			      }
				System.out.println(j+"        "+":- "+this.done[j]);
			}
		
	}
}
public class Library {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		addition lab = new books();
		int choice;
		boolean flag= true;
		while(flag) {
			System.out.println("1. Add book.\n2. Show Book\n3. Issue Book.\n4. Return Book.\n5. Exit.");
			choice =sc.nextInt();
			switch(choice) {
			case 1:  System.out.println("Enter the book name.\n"); 
	        String Bookname;
	        Bookname=sc.next();
		    lab.Addbook(Bookname);
			break;
			case 2: lab.Showbook();
			break;
			case 3: lab.Takebook();
			break;
			case 4: lab.Retrunbook();
			break;
			case 5: flag=false;
				    System.exit(0);
			break;
			default : System.out.println("\nInvalid Input.");
			}
		}
		sc.close();
		
	}

}
