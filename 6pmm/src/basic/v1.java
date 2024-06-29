package basic;

public class v1 {

	public static void main(String[] args) {
		
		/*
		 * variable : name given to a memory location
		 * syntax: datatype variablename=value;
		 * 
		 * word:  String
		 * letter: char
		 * number: int, double, float 
		 *       
		 *       double:  store upto 16 digits after decimal point 
		 *       float  : store upto 8 digits after deicmal point, add f at the end
		 *       
		 * true/false: boolean
		 * 
		 * datatype variablename=value;
	* 
		 * */
		
		String n="dhivya";
		char initial='k';
		int age=31;
		double height=23.89;
		float weight=78.6f;
		boolean result=true;
		
		System.out.println("Name is "+ n);
		System.out.println("Intial is "+ initial);
		System.out.println("Age is "+ age);
		System.out.println("Height is "+ height);
		System.out.println("Weight is "+ weight);
		System.out.println("Result is "+ result);
		
		//area of square : side*side
		// primter of circle: 2*3.14*r
		
		int side=40;
		System.out.println("Area of square is "+ side*side);
		
		double r=3.2;
		System.out.println("perimeter of circle is "+ 3.14*r*r);
		

	}

}
