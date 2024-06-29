package lvg;

import methods.m;

public class l1 {
	//local variable: used within the method
	//global varibale: used throughout the class
	// static, nonstatic global variable
	
	//static method: will accept only static global variable
	// nonstatic method: will accept both static and nonstatic global variable
	
	int age=30;
	static int b=30;
	public static void main(String[] args) {
		
		l1.nm();
		l1 ob= new l1();
		ob.ns();
		
	}
	
	public static void nm()
	{
		System.out.println(b);
		//System.out.println(age);.// will not accept nonstatic global variables
	}
	
	
	public void ns()
	// nonstatic: accept both
	{
		System.out.println(b);
		System.out.println(age);
	}
	
	

}
