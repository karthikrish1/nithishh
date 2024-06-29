package methods;

public class m6 {
public static void main(String[] args) {
	
	//add return statement at end
	// call: sysout statement 
	m6 ob = new m6();
	System.out.println("Division is "+ ob.div());
	System.out.println("Addition is "+ ob.add());
	System.out.println("Area of square is "+ ob.area());
	System.out.println(ob.messge());
	System.out.println("Fav letter is "+ ob.favletter());
	System.out.println("Result is "+ ob.result());
	
	// int:   return perimter of rectangle: 2*(l+b)
	// float  return area of circle (3.14f*r*r)
	// String : return "im fine"
	// char: return 'z'
	//void:  how are you 
}

public int div()
{int a=30;
int b=3;
return a/b;

	}

public double add()
{
	double a=3.2;
	double b=2.3;
	return a+b;
	}

public float area()
{
	float side=3.2f;
	return side*side;
	}


public String messge()
{
	return "where are you";
	}

public char favletter()
{
	return 'a';
	}


public boolean result()
{
	return false;
	}

}
