package oops;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		double d = s.nextDouble();
		char c = s.next().charAt(0);
		String str1 = s.next();
		String str2 = s.nextLine();
		boolean tf = s.nextBoolean();
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(c);
//		System.out.println("Enter employee name");
//		//String empName = s.next();
//		String empName = s.nextLine();
//		System.out.println("Enter EMP ID");
//		int id = s.nextInt();
//		System.out.println("Employee name is: "+empName+" & "+"Emp id is: "+id);
		
//		
//		//int a = 10;
//		
//		if(a%2==0)
//			System.out.println("Even number");
//		else
//			System.out.println("Odd number");
	}

}
