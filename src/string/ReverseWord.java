package string;

public class ReverseWord {

	public static void main(String[] args) {
		String str= "anuj gupta singh";
		//o/p: gupta anuj
		String newStr[]=str.split(" ");
		int len= newStr.length;
		String res="";
		for(int i=len-1; i>=0; i--) {
			res= newStr[i];
			System.out.print(res+" ");
		}
		
		
	
	}

}
