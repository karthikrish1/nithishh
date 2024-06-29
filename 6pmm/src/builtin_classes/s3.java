package builtin_classes;

import java.util.Scanner;

public class s3 {
	public static void main(String[] args) {
		
		//Scanner: get input from the user at run time
		// nonstatic
		//Word: nextLine
		// int: nextInt
		//float: nextFloat
		// boolean: nextBoolean
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your name ");
		String name = s.nextLine();
		System.out.println("Enter ur age : ");
		int age=s.nextInt();
		System.out.println("Enter ur salary : ");
		double sal = s.nextDouble();
		System.out.println("NAme is "+ name);
		System.out.println("Age is "+ age);
		System.out.println("sAalry is "+ sal);
	}

}
