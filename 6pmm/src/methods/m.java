package methods;

public class m {
	
	//static method:    only static global will be accepted
	//nonstatic method:  accept both
	int age=10;
	static int b=20;
public static void main(String[] args) {
	
	m ob= new m();
	ob.nm();
	

}

public void nm()// accepts both
{
	System.out.println(age);
	System.out.println(b);
	}

public static void printt()
{
	System.out.println(b);
}
	//System.out.println(age);}
}
