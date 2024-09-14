package string;

public class RevStringWordByDashed {

	public static void main(String[] args) {
	String str = "We_are_preparing_for_interview";
	String[]arrStr= str.split("_");
	for(String st: arrStr) {
		String st1="";
		int len= st.length();
		for(int i=len-1; i>=0;i--) {
			char c = st.charAt(i);
			st1= st1+c;
			}
		System.out.print(st1+" ");
		}
	}
}
