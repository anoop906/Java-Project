package practise;

public class StringReverseSpaceReserve {

	public static void main(String[] args) {
//		Ques: Space fixed on their own position and rest reverse the string
		
		String str = "Youare for eligible for SDET post";
	     int len = str.length();
		char input[] = str.toCharArray();
		char result[] = new char[len];
		int j = len - 1;
		for (int i = 0; i < len; i++) {
			// space reserve
			if (input[i] == ' ') {
				result[i] = ' ';
			}
			if (input[i] != ' ') {
				if (input[j] == ' ') {
					j--;
				}
				result[i] = input[j];
				j--;
			}
			
		}

		for (char c : result) {
			System.out.print(c);
		}		
	}
}
	
	


