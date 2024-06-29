package excecptionhandling;

import java.util.Scanner;

public class e3 {
public static void main(String[] args) {
	
	// throw new excepitonname("message")
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter age : ");
	int age=s.nextInt();
	
	if(age>18)
	{
		System.out.println("major");
	}
	
	else
	{
		throw new ArithmeticException("Cannot vote");
	}
}
}
