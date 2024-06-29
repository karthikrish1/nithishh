package spr;

public class child extends parent {
	
	int age=0;
public static void main(String[] args) {
	
	child c=new child();
	c.pn();
	
}

public void pn()

{ 
	
	System.out.println(super.age);
	System.out.println(age);}

}
