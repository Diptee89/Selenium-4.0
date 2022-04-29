package oops;
public class TestClass {

	public static void main(String[] args) {
		MathDemo obj1 = new MathDemo();
		obj1.b=10;
		MathDemo.a=20;
		
		System.out.println(obj1.b);
		System.out.println(MathDemo.a);
		System.out.println("**********************");
		MathDemo obj2 = new MathDemo();
		//obj2.b=30;
		//MathDemo.a;
		
		System.out.println(obj2.b);
		System.out.println(MathDemo.a);
		
	}

}
