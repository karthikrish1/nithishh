package methods;

public class c1 {
	
	public static void main(String[] args) {
		
		
		//new class
		
		//nonstatic:  find average of two numbers
		 //default : find addition of three numbers 
		//
		/*
		 * constructor
		 *   special method
		 *   takes classname as its name
		 *   doesnot contain return tyoe
		 *   mainly used for initialisation purpose
		 *   automatically invoked whenever an object is created
		 *   
		 *   syntax for creation:accessmodifier classname(){}
		 *   syntax for calling: classname objectname= new classname();
		* */
		
		c1 ob= new c1();
		c1 ob1= new c1(3,4);
	}
	
	public c1()
	{
		int s=3;
		System.out.println("Area of square is "+ s*s);
	}
	
	public c1(int l, int b)
	{
		System.out.println("Area of rectangle is "+ l*b);
	}

}
