package oops;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size: ");
		//to create array with the specified size from console
		int[] a = new int[s.nextInt()];
		System.out.println("Fill the array");
		//to fill array
		for(int i=0; i<a.length; i++){
			a[i]=s.nextInt();
		}
		System.out.println("Entered valeus are: ");
		//to print array values
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		//to find largest number
		int largest = a[0];
		
		for(int i=1; i<a.length; i++){
			if(a[i]>largest)
				largest=a[i];
		}
		
		System.out.println("largest value is: "+largest);
		//find smallest number
		int smallest = a[0];
		
		for(int i=1; i<a.length; i++){
			if(a[i]<smallest)
				smallest=a[i];
		}
		
		System.out.println("smallest value is: "+smallest);		
		
	}

}
