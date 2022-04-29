package collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		//Set<String>  s = new HashSet<String>();
		HashSet<String>  set = new HashSet<String>();
		set.add("India");
		set.add("USA");
		set.add("PAK");
		System.out.println(set.size());
		//System.out.println(set.iterator().next());
		Iterator<String> ite = set.iterator();
		
		System.out.println(ite.next());
		System.out.println(ite.next());
		//System.out.println(ite.next());
		System.out.println("********************");
		//ite.hasNext();
		
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		
	}
	
}
