package oops;
public class If_Else_Demo {

	public static void main(String[] args) {
		int m = 44;
		int p = 65;
		int c = 90;
		
		int avg = (m+p+c)/3;
		
		if(avg>=75)
			System.out.println("I division");
		else if (avg>=60 && avg<75)
			System.out.println("II Division");
		else if (avg>=40 && avg<60)
			System.out.println("III Division");
		else
			System.out.println("Failed");
		
		System.out.println("Im out of if-else ladder");	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
