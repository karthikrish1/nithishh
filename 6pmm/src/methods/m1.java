package methods;

public class m1 {

	public static void main(String[] args) {
		m1.square();
        m1.average();
        System.out.println("Addition is "+ m2.add());
    	//System.out.println("Area is "+ m2.area());
    	System.out.println("Produc is "+m2.prd());
	}
	
	//public: area of rectangle :   l*b
	
	//new class
	
	// publlic:  addition of three number
	// private: sub of two numbers
	public static void square()
	{
		
		int s=4;
		System.out.println("perimter of square is "+ 4*s);
	}
	
	private static void average()
	{
		int a=8;
		int b=5;
		System.out.println("average is "+ (a+b)/2);
	}
	
	

}


/*
 * 
 * static: fixed memory space
 * we need not to allocate separate memory space for calling it
 * 
 * method should be created outside the main method, inside the class 
 * method should be called inside the main method 
 * 
 * syntax for creation:  accessmdifier  static returntype name(){}
 * syntax for calling:   classname.methodname();
 * 
 * accesmodifier: public, private ,protected 
 * returntype: int, double, float, booleanm string, char 
 * 
 * 
 * */
 