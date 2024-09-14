package array;

import java.util.Arrays;

public class SecondSmallestSecondLargestNumber {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 3, 1,0, 6,12,15,20 };
		int len = arr.length;
//		Arrays.sort(arr);
//		System.out.println("Second smallest number is "+ arr[1]);
//		System.out.println("Second largest number is "+ arr[len-2]);
		
		// for second largest number
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i =0 ; i<len; i++) {
			
			if (arr[i]>max) {
				secondMax=max;
				max=arr[i];
			}
			else if (arr[i]>secondMax && arr[i]!=max) {
				secondMax=arr[i];
			}
		}
		System.out.println("Second largest number is: "+secondMax);
		
		//For 2nd smallest number
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		 for (int j=0; j<len; j++) {
			 if (arr[j]<min) {
				 secondMin=min;
				 min=arr[j];
			 }
			 else if (arr[j]<secondMin && arr[j]!=min) {
				 secondMin=arr[j];
			 }
		 }
		 System.out.println("Second largest number is: "+secondMin);
	}

}
