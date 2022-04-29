package oops;
public class SwitchDemo {

	public static void main(String[] args) {
		char c = 'i';
		
		switch(c){
			case 'a':
				System.out.println(c+" :is a Vowel");
				break;
			case 'e':
				System.out.println(c+" :is a Vowel");
				break;
			case 'i':
				System.out.println(c+" :is a Vowel");
				break;
			case 'o':
				System.out.println(c+" :is a Vowel");
				break;
			case 'u':
				System.out.println(c+" :is a Vowel");
				break;
			default:
				System.out.println(c+" :is a Consonant");	
			
		}
		
		System.out.println("I'm out of switch");
		
	}

}
