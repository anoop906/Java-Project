package string;

public class AlternateLetterCapital {

	public static void main(String[] args) {
		String str = "python is programming language";
		String[] arr = str.split(" ");
		int len = arr.length;
		
		for (int i = 0; i < len; i++) {
			String newStr = arr[i];
			
			for (int j = 0; j < newStr.length(); j++) {
				if (j % 2 == 0) {
					char ch = newStr.charAt(j);
					char newCh = Character.toUpperCase(ch);
					System.out.print(newCh);
				}
				else {
					char ch1 = newStr.charAt(j);
					System.out.print(ch1);
				}
			}
			System.out.print(" ");
			

		}
	}
}