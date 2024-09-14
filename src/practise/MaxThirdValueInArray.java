package practise;

public class MaxThirdValueInArray {

	public static void main(String[] args) {
		int arr[] = { 6700, 6700, 6700, 42, 52, 61, 120 };
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max1) {
				max3 = max2;
				max2 = max1;
				max1 = arr[i];

			}
			 if (arr[i]> max2 && arr[i] != max1) {
				max3=max2;
				max2 = arr[i];
			}
			 if (arr[i]>max3 && arr[i]!=max2 && arr[i]!=max1) {
				max3=arr[i];
				
			}

		}
		System.out.println("Third largest value: "+max3);
		System.out.println("Second largest value: "+max2);
		System.out.println("First largest value: "+max1);
		
		
//Ques: Second largest value
//		
//		int arr[] = { 300, 1000, 34, 42, 52, 61, 120 };
//		int max1 = Integer.MIN_VALUE;
//		int max2 = Integer.MIN_VALUE;
//		int max3 = Integer.MIN_VALUE;
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] > max1) {
//				
//				max2 = max1;
//				max1 = arr[i];
//
//			}
//			if (arr[i]> max2 && arr[i] != max1) {
//
//				max2 = arr[i];
//			}
//
//		}
//		System.out.println("Second largest value: "+max2);
		
		

	}

}
