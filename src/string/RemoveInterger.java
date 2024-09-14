package string;

public class RemoveInterger {

	public static void main(String[] args) {
		 
        String str = "a1n2u34j";
        //o/p: anoop;
        int len = str.length();
        String newstr= "";
        for(int i=0; i<len;i++) {
        	char ch = str.charAt(i);
        	if(Character.isAlphabetic(ch)) {
           	 newstr= newstr+ch;	
        	}
//        	else {
//        		System.out.print(ch);
//        	}
        }
        System.out.println(newstr);
        
        
//        
//        String str1 = "an1o2o3p";
//        //o/p: anoop;
//        String newstr1 = str1.replaceAll("\\d", "");
//        System.out.println(newstr1);

	}

}
