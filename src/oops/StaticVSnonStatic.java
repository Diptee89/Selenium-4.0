package oops;
public class StaticVSnonStatic {

	public static int  a=10;//global static 
	public int b =20;//global non-static
	
	public static void main(String[] args) {	
		StaticVSnonStatic obj = new StaticVSnonStatic();//object
		
		sMethoD();
		obj.nsMethoD();
		System.out.println(a);
		System.out.println(obj.b);
	}
	
	public static void sMethoD(){//static method
		System.out.println("static method");
	}
	
	public void nsMethoD(){//non-static method
		System.out.println("non-static method");
	}
}
