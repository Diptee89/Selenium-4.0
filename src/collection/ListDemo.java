package collection;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();//OR
		//ArrayList<String> list = new ArrayList<String>();
					
		System.out.println(list.size());
		list.add("India");
		System.out.println(list.size());
		list.add("UK");
		System.out.println(list.size());
		list.add("UK");
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		for(int i=0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
	}

}
