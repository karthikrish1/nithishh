package polymorphism;

public class child extends parent{
public static void main(String[] args) {
	
	
	parent p= new parent();
	p.area();
	
	child c= new child();
	c.area();
}

//overriding method
public void area()
{
	int b=3;
	int l=3;
	System.out.println("Area of rectangle is "+ l*b);}
}
