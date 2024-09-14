package practise;

public class StringPalindrome {

	public static void main(String[] args) {
		String str= "nitin";
//		char c[]= str.toCharArray();
//		for (int i= c.length-1;i>=0;i--) {
//			System.out.print(c[i]);
//		}
//		if (c==str) {
//			System.out.println("String is palindrome");
//		}
//
//		else {
//			System.out.println("String is not palindrome");
//		}
		
		
		String res = "";
		for (int i=str.length()-1; i>=0; i--) {
			res= res+str.charAt(i);
		}
		if (res.equals(str)) {
			System.out.println("String is palindrome: "+res);
		}
		else {
			System.out.println("String is not palindrome: "+res);
		}
	}

}
