package com;

public class EHandling {

	public static void main(String[] args) throws Exception {
		System.out.println("ABCD");
		Thread.sleep(2000);
		System.out.println("Now unchecked");
		int[] a = new int[3];
		
		try{
			System.out.println(a[3]);
		}catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
			System.out.println("Entered catch");
		}
		
		
		
//		System.out.println(10/0);
		System.out.println("EFGh");
	}

}
