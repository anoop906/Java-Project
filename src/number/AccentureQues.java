package number;

//Ques: Bus conductor says that ticket machine printing the 
//number in reverse order so correct it. 
public class AccentureQues {

	public static void main(String[] args) {
		int arr[] = { 307, 3200, 120, 409, 105, 17, 290 };
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			String str = Integer.toString(arr[i]);
			int strLen = str.length();
			boolean flag = true;
			for (int j = strLen - 1; j >= 0; j--) {
				char ch = str.charAt(j);
				// if ch =0 and flag = true, then it will skip that number
				
				if (ch != '0' || !flag) {
					System.out.print(ch);
					flag = false;
				}

			}
			System.out.print(" ");
		}
	}

}
