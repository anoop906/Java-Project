package string;

public class ReverseWordWithLetter {

	public static void main(String[] args) {
		String str = "Anuj Kumar";
		//o/p: ramuK junA
		int len= str.length();
		String rev="";
		for (int i=len-1; i>=0;i--) {
			rev= rev+str.charAt(i);
		}
		System.out.println(rev);
	}
}
