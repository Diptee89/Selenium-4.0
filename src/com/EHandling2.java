package com;

public class EHandling2 {

	public static void main(String[] args) throws Exception {
		System.out.println("ABCD");
		Thread.sleep(2000);
		System.out.println("Now unchecked");
		
		try{
			System.out.println(10/0);
		}finally{
			System.out.println("EFGH");
		}
		
		
	}

}
