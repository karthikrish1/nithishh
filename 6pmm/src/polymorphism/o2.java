package polymorphism;

public class o2 {
public static void main(String[] args) {
o2 o1= new o2();
o1.area();
o1.area(3);
o1.area(3.4);
o1.area(30, 9.8);
o1.area(3.4, 10);
}
public  void area()
{
System.out.println("Area ");
}
public  void area(int s)
{
System.out.println("Area of square is "+ s*s);
}
public void area(double r)
{
System.out.println("Area of circle is "+ 3.14*r*r);
}
public  void area(int l, double b)
{
System.out.println("Area of rectangle is "+ l*b);
}
public  void area(double b, int l)
{
System.out.println("Area of triangle "+ 0.5*l*b);
}
}
