package oops;
public class SumDemo {

	public static void main(String[] args) {
//		if(sum(100)>1000)
//			System.out.println("Hello");
		
		if(sum1(100)>5050)
			System.out.println("Hello");
	}
	
	public static void sum(int n){
		int sum =0;
		
		for(int i=1; i<n; i++){
			sum=sum+i;
			
		}
		
		System.out.println(sum);
	}
	
	public static int sum1(int n){
		int sum =0;
		
		for(int i=1; i<n; i++){
			sum=sum+i;
			
		}
		
		return sum;
	}
	
	

}
