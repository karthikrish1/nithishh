package polymorphism;

public class c1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   c1 ob= new c1();
   c1 ob1= new c1(7);
   c1 ob2= new c1(8.0);
   c1 ob3= new c1(9,8.0);
   c1 ob4= new c1(9.8,10);
	}
	
	public c1()
	{
	System.out.println("Area ");
	}
	public  c1(int s)
	{
	System.out.println("Area of square is "+ s*s);
	}
	public c1(double r)
	{
	System.out.println("Area of circle is "+ 3.14*r*r);
	}
	public  c1(int l, double b)
	{
	System.out.println("Area of rectangle is "+ l*b);
	}
	public  c1(double b, int l)
	{
	System.out.println("Area of triangle "+ 0.5*l*b);
	}

}
