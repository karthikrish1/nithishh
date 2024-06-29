package collectionfr;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class m1 {
public static void main(String[] args) {
	/*
	 * map: container where elements will be stored along with its key
	 * key: datatype
	 * element: any type
	 * add
	 * remove
	 * retrive
	 * 
	 * TreeMap: keys: alphabetical/ascending
	 * linkedhashmp: keys: insertion order
	 * hashmap: keys: rndom
	 * 
	 * TreeMap<dtypofky,dtypeofelement> name= new TreeMap<>();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	TreeMap<String,Integer> n= new TreeMap<>();
	n.put("zebra", 10);
	n.put("apple", 210);
	n.put("cat", 110);
	n.put("lion", 0);
	System.out.println(n);
	
	
	LinkedHashMap<String,Integer> n1= new LinkedHashMap<>();
	n1.put("zebra", 10);
	n1.put("apple", 210);
	n1.put("cat", 110);
	n1.put("lion", 0);
	System.out.println(n1);
	
	
	HashMap<String,Integer> n2= new HashMap<>();
	n2.put("zebra", 10);
	n2.put("apple", 210);
	n2.put("cat", 110);
	n2.put("lion", 0);
	System.out.println(n2);
}
}
