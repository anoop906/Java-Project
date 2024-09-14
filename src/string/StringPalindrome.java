package string;

public class StringPalindrome {

	public static void main(String[] args) {
		 String str = "madam";
		 int len = str.length();
		 String newstr = "";
		 for(int i =len-1; i>=0; i--) {
			 char c = str.charAt(i);
			 newstr = newstr+c;
		 }
		 if (newstr.equals(str)) {
			 System.out.println("Word is palindrome");
		 }else {
			 System.out.println("Word is not palindrome");
		 }

	}

}
