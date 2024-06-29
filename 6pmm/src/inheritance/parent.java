package inheritance;

public class parent {
	
	//protected: use it within that package
	// within the subclasses
	
	protected static void ps()
	{
		System.out.println("static method");
	}
	
	public void pn()
	{
		System.out.println("nonstatic method");
	}

}
