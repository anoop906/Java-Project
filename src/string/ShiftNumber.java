package string;

public class ShiftNumber {

	public static void main(String[] args) {
		int num = 530280270;
		String str= Integer.toString(num);
		int len = str.length();
		String newStr= "";
		String twonum=""; //2 ko alag nikalne ke liye
		for(int i=0; i<len; i++) {
			char ch = str.charAt(i);
			if (ch=='2') {
				twonum=twonum+'2'; //22
			}
			else {
				newStr = newStr+ch; //5308070
			}
		}
		newStr=twonum+newStr;  //530807022
		System.out.println(newStr);

	}

}
