package oops;
public class TestMath {

  public static void main(String[] args) {
	MathDemo obj = new MathDemo();
	System.out.println(obj.b);//through object accessing non-static variable 'b'
	
	System.out.println(MathDemo.a);//through class name accessing static variable 'a'
	
	System.out.println(MathDemo.doAdd(11, 22));
	System.out.println(obj.doMultiply(11, 22));
	
  }

}
