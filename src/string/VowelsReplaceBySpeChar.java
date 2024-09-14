package string;

public class VowelsReplaceBySpeChar {

	public static void main(String[] args) {
		String str = "I am Quality Assurance Engineerww";
		
		//String lowerCase = str.toLowerCase();
		//System.out.print(newString);
		
		String newString ="";
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			char newCh= Character.toLowerCase(ch);
			
			if (newCh=='a'||newCh=='e'||newCh=='i'||newCh=='o'||newCh=='u') {
				newString = newString+"*";
			}
			else {
				newString = newString+newCh;
			}
		}
		System.out.println(newString);

	}

}
