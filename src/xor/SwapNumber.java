package xor;

public class SwapNumber {

	public static void main(String[] args) {
		int x=7;  int y=10;
		//o/p: x=10, y=7;
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("x:"+x+" , "+"y:"+y);
 	}

}
