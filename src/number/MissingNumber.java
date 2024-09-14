package number;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,7,8,9,10};
		//output: missing num = 5
		int len = arr.length+1;
		int total=0;
		int sum=0;
		// calculate the total from 1 to last digit 
		for (int i=1;i<=len;i++) {
			total =total+i;
		}
		//calculate the total of numbers in array
		for(int num:arr) {
			sum=sum+num;
		}
		int res = total -sum;
		System.out.println(res);
	}

}
