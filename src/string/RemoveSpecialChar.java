package string;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String str = "a#n@u&j_k*r";
		//o/p: tushar
		String newStr="";
		int len= str.length();
		for(int i=0; i<len; i++) {
			char ch= str.charAt(i);
			if(Character.isAlphabetic(ch)) {
				newStr=newStr+ch;
			}
		}
		System.out.println(newStr);
		
//	String newStr= str.replaceAll("[^a-zA-Z]", "");
//	System.out.println(newStr);
		
		
		
	}

}
