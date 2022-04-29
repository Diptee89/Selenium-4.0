package oops;
public class TestBox {

	public static void main(String[] args) {
		
		Box a = new Box();
		System.out.println(a.volume());
		
		System.out.println("********************");
		
		Box b = new Box();
		b.l=111.11;
		b.w=110.12;
		b.h=101.13;
		System.out.println(b.volume());
		
		System.out.println("********************");
		
		Box c = new Box(12.23, 23.25, 56.23);
		System.out.println(c.volume());
		System.out.println("********************");
		Box d = new Box(10.00, 10.00);
		System.out.println(d.volume());	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
