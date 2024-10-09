package number;

public class ReverseAllDigit2 {

	public static void main(String[] args) {
		int n = 123456;
		int res=0;
		while(n!=0) {
			res = n%10;
			n=n/10;
			System.out.print(res);
		}
		

	}

}
