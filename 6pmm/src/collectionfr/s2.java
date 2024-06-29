package collectionfr;

import java.util.TreeSet;

public class s2 {
public static void main(String[] args) {
	
	TreeSet<String>t= new TreeSet<>();
	t.add("cat");
	t.add("apple");
	t.add("zebra");
	t.add("kite");
	t.add("banana");
	t.add("rose");
	System.out.println(t);
	
	//remove: 
	t.remove("apple");
	System.out.println(t);
	
	for(String x:t)

			{
		System.out.println(x);
			}
}
}
