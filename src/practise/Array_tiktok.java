package practise;

public class Array_tiktok {

	public static void main(String[] args) {
		char arr[][] = { { 'X', 'O', 'X' }, { ' ', 'X', 'O' }, { 'O', ' ', 'M' } };
		int n = arr.length;
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}

		// row result printing
		for (int r = 0; r < n; r++) {
			if (arr[r][0] == (arr[r][1]) && (arr[r][0]) == (arr[r][2])) {
				System.out.print(arr[r][0] + " Winner");
			}
		}
		// column printing
		for (int c = 0; c < n; c++) {
			if (arr[0][c] == (arr[1][c]) && (arr[0][c]) == (arr[2][c])) {
				System.out.print(arr[0][c] + " Winner");
			}
		}
		// Both side Diagonal printing
//		 int r = 0;
//		 int c = 0;
//
//		while (r < n && c < n) {
//			if (r == c || (r + c == 2)) {
//				r++;
//				c++;
//				System.out.print(arr[r][0] + ":Winner");
//			}
//		}

		//Both side Diagonal printing
		int flag = 0;
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < n; c++) {
				if (r == c) {
					flag = 1;
					break;
				}
			}}
			for (int r = 0; r < n; r++) {
				for (int c = 0; c < n; c++) {
			if (r + c == 2) {
				flag = 2;
				break;
			}
			if (flag==1) {
				System.out.println(arr[r][0]+ "Winner");
			}

		}

		System.out.print("");
		}

	}
		}



