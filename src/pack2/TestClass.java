package pack2;

//import pack1.ClassA;
//import pack1.ClassB;
import pack1.*;

public class TestClass {

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		ClassB obj2 = new ClassB();
		System.out.println(obj2.c);
		System.out.println(obj2.d);
	}

}
