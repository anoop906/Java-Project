package string;

public class Stringcompare {

	// String s1 = "Hello";   Define by Literals: Data store in Strong constant pool in same address
	//String s2 = "Hello";    if literals value are same it does not matter in which variable data is store
	
	// String s3 = new String ("Hello");  Define by new keyword: Data store in Heap
	// String s4 = new String ("Hello");  Each variable will store on new address
	
	// == checks the address of the content only
	// .equals() checks the content's value
	public static void main(String[] args) {
		String s1 = "Hello World";
		String s2 = "Hello World";
		
		String s3 = new String("Hello World");
		String s4 = new String("Hello World");
		
		if (s1==s2) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		if (s3==s4) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		if (s1.equals(s2)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		
		if (s3.equals(s4)) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}
