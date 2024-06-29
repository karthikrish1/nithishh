package methods;

public class m7 {
public static void main(String[] args) {
	
	m7 ob= new m7();
	ob.details("dhivya", 30, 3);
	ob.triangle(3.4, 1.3);
	
	//public: BMI  : (weight/(height*height)
	// private:  details: height , weight and address 
	
}

public void details(String n, int age, int id)
{
	System.out.println("Name is "+ n);
	System.out.println("Age is "+ age);
	System.out.println("id is "+ id);
	
}

private void triangle (double b, double h)
{
	System.out.println("Area is "+ 0.5*b*h);}
}
