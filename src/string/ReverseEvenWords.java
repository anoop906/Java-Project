package string;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String str = "He is doing preparation for Quality Assurance Engineer";
	
		String []arrstr = str.split(" ");
		int len= arrstr.length;
		for(int i =0; i<len; i++) {
			String newString = arrstr[i];
			int strLen = newString.length();
			String str1= "";
			if (i % 2 != 0) {
				for(int j= strLen-1; j>=0; j--) {
					char c = newString.charAt(j);
					 str1= str1+c;
					}
				System.out.print(str1+" ");
				
			}
			else {
				str1 = newString;
				System.out.print(str1+" ");
			
		}

	}
}
}

