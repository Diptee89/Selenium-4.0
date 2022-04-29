package oops;
public class StringDemo {

	public static void main(String[] args) {
		String str = new String();
		System.out.println(str);
		str="Hello class class";
		System.out.println(str);
		System.out.println(str.length());//returns length of the string
		System.out.println(str.concat(" today!"));//appends specified string at the 
													//end of the original string
		System.out.println(str.contains("class"));// returns true if original string 
													//contains given string	
		System.out.println(str.charAt(4));//returns character at 4th index
		System.out.println(str.equals("hello class"));//compares given string with
												//original string considering the case
		System.out.println(str.equalsIgnoreCase("hello class"));//compares given string with
												//original string ignoring the case
		System.out.println(str.substring(6));//returns sub string from index 6
		System.out.println(str.indexOf("class"));//returns index of 1st occurrence 
														//of specified string position
		System.out.println(str.endsWith("class"));//checks suffix of original string
		
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
