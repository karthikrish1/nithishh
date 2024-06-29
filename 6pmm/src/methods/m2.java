package methods;

public class m2 {
public static void main(String[] args) {
	
	// other than void:  int, double, float, boolean, string, char 
	// add return statement at end
	// call within sysout statement 
	
	System.out.println("Addition is "+ m2.add());
	System.out.println("Area is "+ m2.area());
	System.out.println("Produc is "+m2.prd());
	System.out.println("REsult is "+ m2.result());
	System.out.println(m2.wish());
	System.out.println("Initial is "+ m2.initial());
	
	
	// finds area of triangle : 0.5*base*heigt -> return type : double
	// return ur name
	// retur ur age
	// void:  details : name, age, address 
	
}
public static int add()
{
	int a=3;
	int b=30;
	return a+b;
	}

private static double area()
{
	double side=4.3;
	double area=side*side;
	return area;
	}

public static float prd()
{
	float a=3.4f;
	float b=2.4f;
	return a*b;
	}

public static boolean result()
{
	return true;
	}


public static String wish()
{
	
	String n="dhivya";
	return "hi  " + n;
}


public static char initial()
{
	char letter='k';
	return letter;
	}
}
