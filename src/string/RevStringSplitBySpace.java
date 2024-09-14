package string;

public class RevStringSplitBySpace {

	public static void main(String[] args) {
	String str = "My self ready for interview";
	 String []arrStr= str.split(" ");
	 for(String st: arrStr) {
		 int len= st.length();
		 for (int i=len-1; i>=0; i--) {
			 char c = st.charAt(i);
			 System.out.print(c);
		 }
		 System.out.print(" ");
	 }

	}

}
