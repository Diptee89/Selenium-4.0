package interfaceP;
public class TestClass {

	public static void main(String[] args) {
		
//		Bank obj = new Bank();
		
		ICICIBank obj1 = new ICICIBank();
		obj1.login();
		HDFCBank obj2 = new HDFCBank();
		obj2.login();
		System.out.println("*******************");
		
		Bank b = new ICICIBank();
		
		String bankName = "";
		Bank obj3; 
		if(bankName.equals("SBI"))
			obj3 = new SBIBank();
		else if(bankName.equals("ICICI")) 
			obj3 = new ICICIBank();
		else if(bankName.equals("HDFC")) 
			obj3 = new HDFCBank();
		
		
		
		
		
	}

}
