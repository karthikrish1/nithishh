package methods;

public class m3 {
public static void main(String[] args) {
	//parameter: variable passed to a function definition
	// argument: value assigned to the parameter while calling
	
	m3.details("dhvya", 80);
	m3.details("java", 0);
	m3.average(9, 8, 6);
	m3.average(90, 88, 66);
	
	// void : public:  area of triangle : o.5*base*height
	// void: private :  height, weight, age 
	
	m5 ob= new m5();
	ob.details();
	//ob.addition();
	
}

public static void details(String n, int age)
{
System.out.println("name is "+ n);	
System.out.println("age is "+ age);
}

private static void average(int a, int b, int c)
{
	System.out.println("Average is "+ (a+b+c)/3);}
}
