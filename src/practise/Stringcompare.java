package practise;

public class Stringcompare {

	// String s1 = "Hello";   Define by Literals
	// String s1 = new String ("Hello");  Define by new keyword
	public static void main(String[] args) {
		String n1 = "a"; // A to Z : 65 to 90
		String n2= "Z";  // a to z : 97 to 122
//		String n3= "B";
//		if(n1.equalsIgnoreCase(n2)) {
//			System.out.println("True");
//		}
//		if (n1.compareTo(n2)>0) //n1>n2 
//			{
//			System.out.println("True");
//		}
		
		if (new String("Hello")==new String("Hello")) {
			System.out.println("True ");
		}
			
		else {
			System.out.println("False");
		}

	}

}
