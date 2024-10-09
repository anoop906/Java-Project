package string;

public class RevStALLWordExceptStarting2words {
	public static void main(String[] args) {
		String str = "He is Quality Assurance Engineer";
		// output = He is ytilauQ ecnarussA reenignE
		String[] arrstr = str.split(" ");
		int len = arrstr.length;
		for (int i = 0; i < len; i++) {
			String newString = arrstr[i];
			int strLen = newString.length();
			String str1 = "";
	if (arrstr[2].equals(newString) || arrstr[3].equals(newString) || arrstr[4].equals(newString)) {
				// if(i>1) {
				for (int j = strLen - 1; j >= 0; j--) {
					char c = newString.charAt(j);
					str1 = str1 + c;
					}
				System.out.print(str1 + " ");
			}
			else {
				str1 = arrstr[i];
			}
			System.out.print(str1 + " ");
		}
	}
}
