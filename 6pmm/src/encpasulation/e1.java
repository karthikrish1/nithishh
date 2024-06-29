package encpasulation;

public class e1 {

	/*
	 * encapsulation: data hiding 
	 * 
	 * doesnot follow inheritance
	 * declare the variable as private
	 * must not assign value straightly to the variable
	 * access the variable through setter, getter
	 * 
	 * setter, getter: nonstatic, public
	 * setter: assign value to the variable
	 * getter: view the value storeed in the variable 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	private String password;
	
	public void set(String p) 
	{
		password=p;
	}
	
	public void get()
	{
		System.out.println(password);
	}
}
