package practise;

public class StringDef {

	public static void main(String[] args) {
		// String Definition in Literals
		
		String s1 = "You can not change";
		String s2 = "You can not" + " change";
		String s3 = "You can not";
		String s4 = s3 + " change";
		String s5 = "You can not";
		String s6 = s3 + " change";
		String s8 = s5 + " change";
		String s7 = s6;
		
		if (s4==s8) {
			System.out.println("True");
		}

//		if (s1.equals(s4)) // isme s1 aur s4 ki ek-ek value with space same hogi.
//			// tab wo true dega. Address se farak hi nahi padta hai.
//			
//		{
//			System.out.println("True");
//		}
//
//		if (s4.compareTo(s1) == 0) // isme s1 aur s4 ki e value with space same hogi.
//			// tab wo true dega. Address se farak hi nahi padta hai.
//		{
//			System.out.println("True");
//		}

//		if (s1==s2) { // Literal me concatenate kar rahe hai to isliye address same kar
//		              //same kar de raha hai.
//		System.out.println("True");
//			
//		}

//		if (s1==s4) {
//			System.out.println("True");
//				
//			}

//		if (s4==s7) {
//			System.out.println("True");
//				
//			}

//		 if (s4==s6) { 
//		 //jab same variable ko baar-baar call kar ke same data ke
//		// saath concatenate karenge tab bhi address badal jayega
//		// value naye address pe store hogi.
//		 System.out.println("True");
//
//		 }

//		if (s6==s7) {
//			System.out.println("True");
//				
//			}

		else {
			System.out.println("False");
		}
	}

}
