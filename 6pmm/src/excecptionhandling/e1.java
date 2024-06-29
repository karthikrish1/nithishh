package excecptionhandling;

public class e1 {

	public static void main(String[] args) {
		
		//try catch
		//try with multiple catch
		//try catch finally
		// throws
		//throw
		
		
		//try:  code which is having prob of getting error
		// catch : will be executed only when error occurs 
		
		
		try {
			System.out.println(9/0);
		}
		
		catch(Exception e)
		{
			System.out.println("Error "+ e);
		}
		
		finally
		{
			System.out.println("always execute");
		}
		
	}
}
