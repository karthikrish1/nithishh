package builtin_classes;

public class s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer n=new StringBuffer("Welcome");
		//  index   0    1   2   3  4   5   6 
		//          W    e   l   c  o   m    e
		
		System.out.println(n.length());
		System.out.println(n.indexOf("m"));
		System.out.println(n.charAt(1));
		
		System.out.println(n.append("bye"));
		System.out.println(n.insert(1, 'V'));
		
		System.out.println(n.deleteCharAt(1));
		System.out.println(n.delete(7, 10));
		
		System.out.println(n.reverse());
		System.out.println(n.reverse());
		
		System.out.println(n.replace(0, 3, "bbb"));
		System.out.println(n);
	}

}
