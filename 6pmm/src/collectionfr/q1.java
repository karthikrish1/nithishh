package collectionfr;

import java.util.concurrent.ArrayBlockingQueue;

public class q1 {
public static void main(String[] args) {
	/*
	 * queue : not index
	 * add
	 * remove
	 * retrive only head of the queue
	 * iteration is possible
	 * size limited
	 * * */
	ArrayBlockingQueue<Double>d= new ArrayBlockingQueue<>(4);
	d.add(8.9);
	d.add(3.4);
	d.add(2.3);
	d.add(10.9);
	System.out.println(d);
	System.out.println(d.size());
	
	d.remove(3.4);
	System.out.println(d);
	
	System.out.println(d.peek());
	
	for(double x:d)
	{
		System.out.println(x);
	}
}
}
