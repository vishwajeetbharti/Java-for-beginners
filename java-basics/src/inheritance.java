class past{
	past(){
		System.out.print("i am past class contructer.\n");
	}
	past(int b){
		System.out.print("i am past class called by supper contructer.\n");
	}
	public int a;
	
	public int getter() {
		return a;
	}
	public void setter(int a) {
		this.a=a;
	}
}
class present extends past{
	present(){
		super(9);
		System.out.print("i am present class contructer.\n");
	}
	
	public int get () {
		return a;
	}
	public void set(int b) {
		this.a=b;
	}
}
public class inheritance {

	public static void main(String[] args) {
		//past p = new past();
		present p2 = new present();
		//p.setter(55);
		//System.out.println(p.getter());
		p2.set(55);
		System.out.println(p2.get());
	}

}
