package methods;

public class m8 {

	public static void main(String[] args) {
		m8 ob= new m8();
		System.out.println("subtraction is "+ ob.sub(30, 9));
		
       System.out.println("produc is "+ ob.prod(3.2, 3.4));
       
       // float:  area of square 
       // string:  how areyou  name?
       // boolean:  false 
	}
	
	public int sub(int m, int n)
	{
		return m-n;
	}
	
	private double prod(double a , double b)
	{
		return a*b;
	}

}
