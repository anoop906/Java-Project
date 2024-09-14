package string;

public class StringReplaceMethod {

	public static void main(String[] args) {
		//Ques:1
		String str= "Hello World xyzabc";
		// o/p= Hello World
		String newstr = str.substring(0, 11);//last index(11th) excluded
		System.out.println(newstr);
		
		//Ques:2
		String str1= "H:e:l:l:o W:o:r:l:d";
		// o/p= Hello World
		String newstr1 = str1.replaceAll(":", "");
		System.out.println(newstr1);
		
		//Ques:3
		String str2= "H:e:l:l:o W:o:r:l:d";
		// output: H/e/l/l/o W/o/r/l/d
		String newstr2= str2.replace(':', '/');
		System.out.println(newstr2);
		
		//Ques:4
        String str3= "Anup";
        // output: Anoop
        String newstr3 = str3.replace("u", "oo");
        System.out.println(newstr3);
        
     //Ques:6
       StringBuilder sb = new StringBuilder();

     // Append characters: ye char ya int ko bhi String me hi convert karega internally
     sb.append('h');
     sb.append('u');
     sb.append('m');
     sb.append('a');
     sb.append('n');
     sb.append(1);

     // Append strings
     sb.append(" is a strong data.");

     // Convert StringBuilder to String
     String result = sb.toString();
     
     // Output: human1 is strong data.
     System.out.println(result); 
     
        
        
       
        
	}

}
