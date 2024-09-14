package practise;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringReverse {

	public static void main(String[] args) {
		
//		String str = "Different method uses in Java";
//
//		
//		char Char1 = str.charAt(0);
//		System.out.println(Char1);
//		
//		char Char10 = str.charAt(10);
//		System.out.println(Char10);
//		
//		char Char17 = str.charAt(17);
//		
//		//It will not print all char simultaneously in concatenation form.
//		
//		//because it will take String value or single char.
//		System.out.println(Char17+Char1+Char10); // It will print total sum of that chars in ASCII value 
//		
//		
//		//"" can write anywhere in the parentheses.
//		System.out.println(Char17+""+Char1+Char10);
//		
//		// Converting the char in to String
//		System.out.println(Character.toString(Char17)+Character.toString(Char10)+Character.toString(Char1));
//		
//		// Reverse string using toCharArray() with for loop;
//		char []arr= str.toCharArray();
//		for (int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]);
//		}
//		
//		// Simple print the an array of char using foreach
//		for(char c: arr) {
//			System.out.println(c);
//			}
//		
//		
//	// String Builder	
//		StringBuilder input = new StringBuilder(str);
//		System.out.println(input.reverse());
		
//Ques: Reverse an array		

//		String []str = {"Java", "Python", "React","SQL", "Html","Css"};
//		int len = str.length;
//	
//		for (int i =len-1; i>=0;i--) {
//			String newstr = str[i];
//			int length = newstr.length(); 
//			for(int j= length-1;j>=0;j--) {
//				System.out.print(newstr.charAt(j));
//				
//			}
//		}
//			
		
//Ques: Reverse an array 		
		
//		String []str = {"Java", "Python", "React","SQL", "Html","Css"};
//		int len = str.length;
//		for (int i =0; i<len;i++) {
//			if (i==1) {
//			       // Array str ki i at 1 par jo string ki length hai usko reverse karo
//				for (int j = str[i].length() - 1; j >= 0; j--) {
//					char c= str[i].charAt(j);
//					System.out.print(c);
//				}
//				System.out.print(" ");
//		        	   }
//				
//				// At index 1 its reverse the value by using another String variable
////				String name = str[i];
////				for (int k= name.length()-1; k>=0;k-- ) {
////					System.out.print(name.charAt(k));
////				}
////				System.out.print(" ");
////			} 
//			// At index 2 it jump 
//			else if (i == 2) {
//				continue;
//
//			}
//			// rest all value of an array print as it is.
//			else {
//				System.out.print(str[i] + " ");
//			}
//		}
		
		
	//Ques: Reverse array using While loop
		
//		String arr [] = {"Ratnakar", "Anoop", "Dinesh Kartik"};
//		 
//		int j= 0;
//		while(j<arr.length) {
//			if(j==1) {
//			  int x= arr[j].length()-1;
//			  
//			  while(x>=0) {
//				  System.out.print(arr[j].charAt(x));
//				  x--;
//			  }
//			  System.out.print(" "); 
//			}
//			
//			else {
//				System.out.print( arr[j]+" ");
//			}
//			
//			j++;
//		
//		}
		
		// Ques: Reverse the string using  Switch Case
		
//		
//		String str []= {"Virat","Dhoni", "Rohit", "Duplesis"};
//		     int i=0;      
//		do {
//			if (i==2) {
//				int j = str[i].length()-1;
//				while(j>=0) {
//					System.out.print(str[i].charAt(j));
//					j--;
//			} System.out.print
//				
//				(" ");
//				}
//			else {
//				System.out.print(str[i]+" ");
//			}
//				i++;
//		      }while(i<str.length);
		
	
		//Ques: Print the reverese String by use Split method 	
//		
//		String sentence = "Rohit Sharma from Mumbai";
//
//		String[] dd = sentence.split("from");
//		for (String str : dd) {
//
//			String str2 = " ";
//
//			// if (dd[0]==str)  jab 'dd' array ki 0 index pe jo value hai wo String str ki value me kahi bhi match kare to if condition chale  
//			//if (dd[0].compareTo(str) == 0) 
//			
//			if (dd[0].equals(str)){
//				for (int i = str.length() - 1; i >= 0; i--) {
//					char c = str.charAt(i);
//					str2 = str2 + c;
//				}
//					System.out.print(str2);
//				}
//			
//			else {
//				System.out.print(str);
//				
//					
//					
//				}
//			}
		
		
//		//Ques : String Builder
//		 String sentence = "Viral Kohli was the caption of RCB";
//		 StringBuilder input = new StringBuilder(sentence);
//		 System.out.println(input.reverse());
		
//		//Ques: toCharArray
//		 String sentence = "Virat Kohli was the caption of RCB";
//		char char1 []= sentence.toCharArray();
//		//System.out.println(char1.length);//34
//		for (int i= char1.length-1; i>=0; i--) {
//			
//			System.out.print(char1[i]);
//		}
		
		
		
		

				
			
		
		
		}
			 
	}
		 
	
	
	



