package collectionfr;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class s1 {
public static void main(String[] args) {
	/*
	 *set: not indexed
	 *add
	 *remove
	 *cannot retrive
	 *will not accept duplicates
	 *
	 * TreeSet:   alphabetical/ascending order
	 * LinkedHashset:  insertion order
	 * HashSet:      random order * 
	 * */
	
	TreeSet<Integer>t= new TreeSet<>();
	t.add(90);
	t.add(10);
	t.add(3);
	t.add(2);
	t.add(2);
	t.add(100);
	System.out.println(t);
	
	
	LinkedHashSet<Integer>t1= new LinkedHashSet<>();
	t1.add(90);
	t1.add(10);
	t1.add(3);
	t1.add(2);
	t1.add(100);
	System.out.println(t1);
	
	
	HashSet<Integer>t11= new HashSet<>();
	t11.add(90);
	t11.add(10);
	t11.add(3);
	t11.add(2);
	t11.add(100);
	System.out.println(t11);
}
}
