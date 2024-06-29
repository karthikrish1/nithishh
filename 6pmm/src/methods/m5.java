package methods;

public class m5 {

	public static void main(String[] args) {
		m5 ob= new m5();
		ob.details();
		ob.addition();
		
		//public:   division of two numbers
		//private: average of four numbers 
	
	}
	
	public void details()
	{
		String n="dhivya";
       int age=30;
       System.out.println("Name is "+ n);
       System.out.println("Age is "+ age);
	}
	
	private void addition()
	{
		double a=3.4;
		double b=2.3;
		System.out.println("Addition of two numbers "+ (a+b));
	}
}


/*method should be created outside the main method
 *method should be called inside themain method
 *return type other than void
 *    add return statement at end
 *    sysout 
 * 
 * nonstatic 
 * 
 * syntax for creation: accessmodifier returntype name(){}
 * syntax for calling:
 * 
 * step1: object creation nd naming:     classname objectname= new classname();
 * step2:                                objectname.methodname();
 * 
 * 
 * 
 * */