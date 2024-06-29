package collectionfr;

import java.util.ArrayList;

public class l1 {
public static void main(String[] args) {
	
	/*
	 * list 
	 * index based
	 * add
	 * remove
	 * retrive
	 * iterate
	 * duplicates accept
	 * ArrayList<Datatype> name= new ArrayList<>();
	 * int=> Integer
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

	ArrayList<String>l= new ArrayList<>();
	l.add("hi");
	l.add("hello");
	l.add("how");
	l.add("bye");
	//  index  0   1     2  3   
	//        hi  hello ....
	
	System.out.println(l);
	System.out.println(l.size());
	
	//remove: know the index
	l.remove(3);
	System.out.println(l);
	
	//retrive: know the index
	System.out.println(l.get(1));
	System.out.println("elements are :");
	
	//enhanced for loop/for each loop
	//for (datatype tempvariablename:nameofthecollection)
	for(String x:l)
	{
		System.out.println(x);
	}
}
}
