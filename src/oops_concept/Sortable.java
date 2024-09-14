package oops_concept;

import java.util.Arrays;

public interface Sortable {
	public void sort();
}

class BubbleSort implements Sortable {

	@Override
	public void sort() {
		int arr[] = { 14, 5, 7, 9, -3, -8, 45 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					arr[j] = arr[i] + arr[j];
					arr[i] = arr[j] - arr[i];
					arr[j] = arr[j] - arr[i];
				}
			}
		}
		System.out.print("Bubble sorting is: ");
		for (int a : arr) {
			System.out.print(a + " ");

		}
	}

}

class SelectionSort implements Sortable {

	@Override
	public void sort() {
		int arr[] = { 34, -103, 55, 17, 459, -13, -68, 45, 3 };
//		Arrays.sort(arr);
//		System.out.print("\nSelection sorting is: ");
//		for (int a : arr) {
//			System.out.print(a + " ");
//		}
		
		int key;
		for (int i = 0; i < arr.length; i++) {
		    key = arr[i];
		  for (int j = i+1;j<arr.length;j++) {
			  if (key>arr[j]) {
				  
			  }
		  }
		 }
		
		System.out.print("\nSelection sorting is: ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
		}
		
