package collectionfr;

import java.util.Hashtable;
import java.util.TreeMap;

public class m2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashmap: random 
		// hashtable: same   output
		Hashtable<String,Integer> n= new Hashtable<>();
		n.put("zebra", 10);
		n.put("apple", 210);
		n.put("cat", 110);
		n.put("lion", 0);
		System.out.println(n);
		
		n.remove("zebra");
		System.out.println(n);
		
		System.out.println(n.get("cat"));
		
		System.out.println(n.keySet());
		
		System.out.println(n.values());
	}

}
