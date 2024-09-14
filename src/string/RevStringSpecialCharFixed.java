package string;

public class RevStringSpecialCharFixed {

	public static void main(String[] args) {
		String str = "A^N$O#O(P";
		int i = 0;
		int j = str.length() - 1;
		char ch[] = str.toCharArray();
		while (i < j) {
			if (!Character.isAlphabetic(ch[i])) {
				i++;
			} else if (!Character.isAlphabetic(ch[j])) {
				j--;
			} else if (Character.isAlphabetic(ch[i]) && Character.isAlphabetic(ch[j])) {
				char temp = ch[i];
				ch[i] = ch[j];
				ch[j] = temp;
		// move to the next characters after a successful swap
				i++;
				j--;
			}
		}
		//because String is class
		String newString = new String(ch);
		System.out.println(newString);

	}
}

