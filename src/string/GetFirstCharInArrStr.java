package string;

public class GetFirstCharInArrStr {

	public static void main(String[] args) {
		String arr[]= {"Anuj","Kumar","Gupta"};
		//output: A K G
		int len = arr.length;
		for(int i=0; i<len; i++) {
			String str = arr[i];//Anuj
			for (int j=0;j<str.length();j++) {
				if (j==0) {
					char ch = str.charAt(j);
					System.out.print(ch);	
				}
				
			}
			System.out.print(" ");
			
		}

	}

}
