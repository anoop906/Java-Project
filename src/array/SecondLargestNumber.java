package array;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int arr[] = { 13, -44, 54, 0, 89, -625, 688, 688, 700, 220 };
		int len = arr.length;
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < len; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			} else if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}
		}
		System.out.println("2nd maximum number is: " + secondMax);
	}
}
