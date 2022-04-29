package inheritance.pack1;
public class TestClass {

	public static void main(String[] args) {
		Car a = new Car();
		System.out.println(a.mirrors);
		System.out.println(a.wheels);
		a.start();
		a.accel();
		a.stop();
		//a.fillFuel();
		System.out.println("**********************");
		
		BMW b = new BMW();
		System.out.println(b.mirrors);
		System.out.println(b.wheels);
		b.start();
		b.accel();
		b.stop();
		b.fillFuel();
		System.out.println("***************************");
		Car c = new BMW();
		System.out.println(c.mirrors);
		System.out.println(c.wheels);
		c.start();
		c.accel();
		c.stop();
//		c.fillFuel();
		
		
	}

}
