package array;

public class LargestNumber {

	public static void main(String[] args) {
		int arr[]= {13,-44,54,0,89,-625,700,220,0,-44,-923};
		int len = arr.length;
		int max = arr[0];
		for (int i=0; i<len;i++) {
			if(arr[i]>max) {
				max= arr[i];
			}
			
		}
		System.out.print("Maximum number is: "+max);

	}

}
