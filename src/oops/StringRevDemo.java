package oops;
public class StringRevDemo {

	public static void main(String[] args) {
		String str = "NitiN";
		String rev ="";
		for(int i=str.length()-1; i>=0; i--){
			//System.out.println(str.charAt(i));
			//System.out.print(str.charAt(i));
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
				
		if(str.equals(rev))
			System.out.println("original string, revese stirng both are same");
		else
			System.out.println("reverse string is not same as original");
	}

}
