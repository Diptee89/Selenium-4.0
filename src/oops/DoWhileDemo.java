package oops;
public class DoWhileDemo {

	public static void main(String[] args) {
		
		int i=12;
		
		do{
			if(i%2==0)
				System.out.println(i+" is Even Number");
			
			i++;
			
		}while(i<=10);
		
		System.out.println("Out of do-while");
	}

}
