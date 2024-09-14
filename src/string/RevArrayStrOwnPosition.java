package string;

public class RevArrayStrOwnPosition {

	public static void main(String[] args) {
		String []arrStr = {"Java","is","programming","language"};
		for(int i=0; i<arrStr.length;i++) {
			String str = arrStr[i];
			int len = str.length();
			for(int j= len-1; j>=0; j--) {
				char ch = str.charAt(j);
				System.out.print(ch);
			}
			System.out.print(" ");
		}

	}

}
