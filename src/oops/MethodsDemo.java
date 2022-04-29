package oops;
public class MethodsDemo {

	public static void main(String[] args) {
		System.out.println("Main method");
		udMethod();
		System.out.println("Back to Main method");
		udMethod();
	}
	
	public static void udMethod(){
		System.out.println("User define method");
	}

}
