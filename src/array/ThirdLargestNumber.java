package array;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		int arr[]= {13,-44,54,0,89,220, 220,220,-625,688,700,220,0,-44,-923,688};
		int len = arr.length;
		int max = Integer.MIN_VALUE;
		int max2= Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		for (int i=0; i<len;i++) {
			if (arr[i]>max) {
				max3 = max2;
				max2= max;
				max= arr[i];
			}
			else if (arr[i]>max2 && arr[i]!= max) {
				max3=max2;
				max2= arr[i];
			}
			else if (arr[i]>max3 && arr[i]!= max && arr[i]!= max2) {
				max3 = arr[i];
			}
		}
		System.out.println("3rd largest number is: "+max3);

	}

}
