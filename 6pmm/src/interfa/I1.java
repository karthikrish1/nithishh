package interfa;

public interface I1 {

	/*
	 *blue print of class
	 *doesnot contain main method
	 *doesnot contain staticmethod
	 *will have nonstatic method with default keyword
	 *will have abstract mthod
	 *     will be empty
	 *     will not have abstract keyword
	 *     will be redefined in the class
	 *     
	 * class<=> class: extends
	 * class<=> interface: implements 
	 *  
	 *  class=> implements interfacename 
	 * * 
	 * */
	
	default public void nm()
	{
		System.out.println("nonstatic method");
	}
	
	public void ab();
	
}
