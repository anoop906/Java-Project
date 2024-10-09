package xor;

public class MissingNumber {
	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6,7,8,9};
		int n= arr.length+1;
		int arrRes=0;
		int res=0;
		//xor of all the number in array
		for(int num: arr) {
			arrRes=arrRes^num; 
		}
		//xor of number from 1 to last number
		for(int i=1; i<=n;i++) {
			res=res^i;
		}
		
		int missingNum = arrRes^res;
		System.out.println(missingNum);
	}
}