package polymorphism;

public class o1 {
	
	//inheritance
	// polymorphism- overloading and overriding
	//encapsulation
	//abstraction
	
	//overloading: using same methodname for different purpose 
	//             showing difference in number /datatype/sequence
	//              static, nonstatic, constructor 
	
	
	public static void main(String[] args) {
		o1.area();
		o1.area(3);
		o1.area(3.4);
		o1.area(30, 9.8);
		o1.area(3.4, 10);
	}
    public static void area()
    {
    	System.out.println("Area ");
    }
    public static void area(int s)
    {
    	System.out.println("Area of square is "+ s*s);
    }
    public static void area(double r)
    {
    	System.out.println("Area of circle is "+ 3.14*r*r);
    }
    public static void area(int l, double b)
    {
    	System.out.println("Area of rectangle is "+ l*b);
    }
    public static void area(double b, int l)
    {
    	System.out.println("Area of triangle "+ 0.5*l*b);
    }
}
