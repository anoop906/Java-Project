package practise;

public class InsertionArray {

	public static void main(String[] args) {
//		int[] arr = { 1, 10, 5, -23, 456, 6, 0 };
//
//		for (int i = 1; i < arr.length; i++) {
//			int key = arr[i];
//			int j = i - 1;
//			while (j >= 0 && arr[j] > key) {
//				arr[j + 1] = arr[j];
//				j--; // j=j-1;
//			}
//			arr[j + 1] = key; // arr[-1+1]=key;
//		}
//		System.out.println("Shorted array: ");
//
//		for (int i = arr.length - 1; i >= 0; i--) {
//			System.out.print(arr[i] + " ");
//		}

	
		
// Ques: Use insertion sort to an array of String
		
//		String array[] = { "Anuj", "Anoop", "Ratnakar", "Himanshu", "Shivam", "Aakash" };
//		for (int i = 1; i < array.length; i++) {
//			String key = array[i];
//			int j = i - 1;
//			while (j >= 0 && array[j].compareTo(key) > 0) {
//				array[j + 1] = array[j];
//				j--;
//			}
//			array[j + 1] = key;
//		}
//		System.out.println("Shorted array is: ");
//		for (String str : array) {
//			System.out.print(str + " ");
//		}
	
	char char1[] = { 'a','b','c','d','e','A','C','D','z','Z'};
	 for(int i=1; i<char1.length;i++) {
		 char key= char1[i];
		 int j = i-1;
		 while(j>=0 && char1[j]>key) {
			 char1[j+1]= char1[j];
			 j--;
		 }
		 char1[j+1]= key;
	 }
	 System.out.println("Shorted alphabet: ");
	 for (char c: char1) {
		 System.out.print(c+" ");
	 }
	
	}

}
