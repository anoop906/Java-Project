package xor;

public class UniqueNumber {

	public static void main(String[] args) {
		int []arr = {1,2,3,4,3,2,1};
		int len = arr.length;
		int res=0;
		for (int i=0;i<len;i++) {
			res= res^arr[i];
		}
		System.out.println(res);

	}

}
