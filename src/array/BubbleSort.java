package array;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {13,-44,54,0,89,-625,700,220,0};
		int len = arr.length;
		int temp = 0;
		for (int i=0; i<len; i++) {
			for (int j=i+1; j<len;j++) {
				if (arr[i]>arr[j]) {
					 temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			} System.out.print(arr[i]+" ");
			
		}
		
//---------------**Bubble Sort**-------------------------------------------
		
//		int arr[] = {13, -44, 54, 0, 89, -625, 700, 220, 0};
//		int len = arr.length;
//		int temp = 0;
//
//		for (int i = 0; i < len - 1; i++) {
//			for (int j = 0; j < (len - 1) - i; j++) { 
//		        if (arr[j] > arr[j + 1]) {
//		            temp = arr[j];
//		            arr[j] = arr[j + 1];
//		            arr[j + 1] = temp;
//		        }
//		    }
//		}
//
//		
//		for (int i = 0; i < len; i++) {
//		    System.out.print(arr[i] + " ");
//		}


	}

}
