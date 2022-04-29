package oops;
public class ArrayDemo2 {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		//decalaration
		int[] c = new int[3];
		//adding values into array
		c[0]=10;
		c[1]=20;
		//reading values from array
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println("--------------");
		for(int i=0; i<c.length; i++){
			System.out.println(c[i]);
		}
		
		
		int[] d = {10, 20, 30, 40};
		for(int i=0; i<d.length; i++){
			System.out.println(d[i]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
