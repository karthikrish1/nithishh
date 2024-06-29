package excecptionhandling;

public class e2 {
	public static void main(String[] args) {
		try {
			//System.out.println(9/0);
			String n="welcome";
			System.out.println(n.charAt(10));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Arithmetic exception");
		}
		
		catch(Exception e)
		{
			System.out.println("Error "+ e);
		}
	}

}
