package final_keyword;

public class Final_variable {

	public static void main(String[] args) {
		int a=5;
		int c = ++a;
		System.out.println(c);
		
		//because of final keyword it can not change 
		final int b = 7;
		System.out.println(b);
//		int d= ++b;

	}

}
