package oops;
public class WhileDemo {

	public static void main(String[] args) {
		int original = 12521;
		int n =original;
		int rem;
		int rev=0;
		
		while(n>0){
			rem=n%10;
			n=n/10;
			rev=(rev*10)+rem;
		}
		
		//System.out.println(rev);
		if(original==rev)
			System.out.println("Given number "+original+" is a palindorme");
		else
			System.out.println("Given number "+original+" is not a palindorme");
		
	}

}
