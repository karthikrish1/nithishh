package loops;

public class s1 {
public static void main(String[] args) {
	
	/*
	 * double/float
	 * 
	 * switch(expression)
	 * {
	 * case:
	 *    statmeent
	 *    break;
	 *    
	 *    
	 * case : 
	 *    statement
	 *    break;
	 *    
	 *    
	 *  default: 
	 *     statement
	 *     break;
	 *     
	 * 
	 * */
	int age=23;
	switch(age)
	{
	case 2:
		System.out.println("toddler");
		break;
		
	case 18:
		System.out.println("adult");
		break;
		
	case 60:
		System.out.println("old");
		break;
		
   default:
	    System.out.println("doesnot match");
	    break;
	}
}
}
