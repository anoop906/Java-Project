package string;

public class RevereseArrayString2ndwordOnly {
	public static void main(String[] args) {
	String []arrString = {"Anuj","Kumar","26012002"};
	int len = arrString.length;
		for(int i =0; i<len; i++) {
			if (i == 1) {
			String str = arrString[i];
			int strLen = str.length();
			for (int j = strLen - 1; j >= 0; j--) {
				System.out.print(str.charAt(j));
			}
		}
		System.out.print(" ");
			if (i == 0 || i == 2) {
			System.out.print(arrString[i] + " ");

			}
		}
	}
}


