package operators;

public class o1 {

	public static void main(String[] args) {
		
		//arithmetic operators:  +,-,*,/
		// comparision operators: <,>,<=,>=,==!=
		//assignment operators : +=,-=,*=,/=
		//conditional/ternary operator:  condition ? true: false
		//logical operator: and, or, not
		int age=30;
		System.out.println(age);
		//add 5 to age
		// sub2 from age 
		// multipley age by 10
		//System.out.println(age*=10);
		//divide age by 3
		//System.out.println(age/=3);
		
		int a=30;
		int b=20;
		//                cond ?   true      : false 
		System.out.println(a>b ? " a is bgger": " b is bigger");
		/*
		 * and :  &&
		 * 
		 * true    true    true
		 * true    false   false
		 * false   true    false
		 * false   fakse   false
		 * 
		 * or: ||
		 * 
		 * true     true     true
		 * true     false    true
		 * false    true     true
		 * false    false    false
		 * 
		 * not : !
		 * 
		 * true     false
		 * false    true
		 * 
		 *  * 
		 * */
		
		int m=30;
		int n=2;
		System.out.println("And");
		System.out.println(m>10 && n<5);
		System.out.println(m>10 && n==5);
		System.out.println(m==10 && n<5);
		System.out.println(m==10 && n==5);
		System.out.println();
		System.out.println("or");
		System.out.println(m>10 || n<5);
		System.out.println(m>10 || n==5);
		System.out.println(m==10 || n<5);
		System.out.println(m==10 || n==5);
		System.out.println();
		System.out.println("Not");
		System.out.println(m==30);
		System.out.println(m!=30);
	}
}
