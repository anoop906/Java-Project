package number;

public class ReverseALLDigits {

	public static void main(String[] args) {
		int num = 12345678;
		// String str = String.valueOf(num);
		String str = Integer.toString(num);

		for (int i=str.length()-1; i>=0; i--) {

			System.out.print(str.charAt(i));
		}

	}

}
