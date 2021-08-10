class student {
	String name;
	int roll;
	public void printinfo() {
		System.out.println(name);
		System.out.println(roll);
	}
}
public class java_class {

	public static void main(String[] args) {
		System.out.println("This is a coustom class.");
		student vishwajeet = new student();//Instantiating a new Employee Object.
		// Setting Attributes
		vishwajeet.roll=111;
		vishwajeet.name="Vishwajeet Bharti";
		// printing the Attributes
		//System.out.println(vishwajeet.name +"\n"+ vishwajeet.roll);
		//OR
		vishwajeet.printinfo();
	}

}
