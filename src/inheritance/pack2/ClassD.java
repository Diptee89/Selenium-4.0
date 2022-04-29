package inheritance.pack2;

import pack1.ClassA;

public class ClassD extends ClassA{

	public static void main(String[] args) {
		ClassD obj = new ClassD();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}

}
