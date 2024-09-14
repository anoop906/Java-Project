package practise;

import java.util.Scanner;

public class Recursion {
	
//	//1.  Total Sum from that number to zero
//	public static int num(int n) {
//		if (n > 0) {
//			return n + num(n - 1);
//		} else {
//			return 0;
//		}
//	}
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter any number: ");
//		int n = input.nextInt();
//		int res = num(n);
//		System.out.println("Total Sum from zero to that number: "+res);
//
//	}
	
	// 2. Total sum from zero to that number
	
//	public static int num(int n) {
//		if (n > 10) {
//			return 0;
//		}
//		int res = n + num(n + 1);
//		//System.out.println(res);
//		 return res;
//	}
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter any number: ");
//		int n = input.nextInt();
//		num(1);
//		System.out.println(num(1));
//	}
	
	//Case 3: Taking three parameter then find Total sum from 1 to n
	
	public static void main(String[] parameter) {
		totalsum(1, 10, 0);
	}

	public static void totalsum(int i, int n, int sum) {
		if (i == n) {
			sum = sum + i;
			System.out.println(sum);
			return;
		}
		sum = sum + i;
		totalsum(i + 1, n, sum);
	}
}

