package collection;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		//Map<String, String> map = new HashMap<String, String>(); //OR
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("Name", "Venkat");
		map.put("EMP ID", "5000");
		
		System.out.println(map.get("Name"));
		
		
	}

}
