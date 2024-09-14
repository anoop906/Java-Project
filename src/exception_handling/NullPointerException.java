package exception_handling;

public class NullPointerException {

	public static void main(String[] args) {
		String str = null;
		
		if (str.equals("abc")) {
			System.out.println("equal");
		}
		else {
			System.out.println("not equal");
		}

	}

}
