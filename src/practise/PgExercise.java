package practise;

import java.util.Scanner;

public class PgExercise {
	
	// 	Case: 1(not working)
	
//	public static String printMyName(int x, String abc) {
//		System.out.println("Your name is: "+abc);
//		System.out.println("Your age is: "+x);
//		return abc ;
//	}
//	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Scanner input = new Scanner (System.in);
//		String what = input.nextLine();
//		int y = input.nextInt();
//		
//		
//		printMyName (y,what);
	
	
	//case 2:  Data string ka liya hai par defnition galat batayi hai
	         // usme integer bhi hai
	
//	public static String printMyName(int x, String abc) {
//	System.out.println("Your name is: "+abc);
//	
//	return abc ;
//}
//
//
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//
//	Scanner input = new Scanner (System.in);
//	String what = input.nextLine();
//	
//	printMyName (what);
	

	//	Case: 3 (not working)
	
//	public static String printMyName( int x, String abc) {
//	System.out.println("Your name is: "+abc);
//	System.out.println("Your age is: "+x);
//	return abc ;
//}
//
//
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//
//	Scanner input = new Scanner (System.in);
//	
//	int y = input.nextInt(); // do data daalne ke liye space use karo.
//	String what = input.nextLine();
//	
//	
//	printMyName (y, what);
	
//}
	
	
	
	//Case: 4
	
	// Scanner se input jis order me lenge
	// Function ki defnition (ka argument) bhi usi order me hogi
	// When we call the function in main method defnition  ki tarah hi parameter ka order hoga
	// Print ka order kisi bhi tarike se hoga.
	
//	public static String printMyName(int x, String abc) {
//	System.out.println("Your name is: "+abc);
//	System.out.println("Your age is: "+x);
//	return abc ;
//    }


//	public static void main(String[] args) {
	// TODO Auto-generated method stub
//	Scanner input = new Scanner (System.in);
//	
//	int y = input.nextInt(); // do data daalne ke liye space use karo.
//	String name = input.nextLine();
//	
//	printMyName (y,name);
	
		
		
	//  Find the largest value and print by ternary operator (Code break hua hai)
		
//		int a=130;
//		int b=4;
//		int c=6900;
//		int d=700;
//		int e=5800;
//		int res= (a>b)?(a>c)?(a>d)?(a>e)?a:b?(b>c):(b>d):(b>e)?b:d?(c>d):(c>e)?c:(d>e)?d:e;
//	System.out.println(res);
	
	
	
	//Ques:  Addition of the two number using FUNCTION
		
//		public static int calculateSum ( int x, int y) {
//			int sum= x+y;
//			//System.out.println("Your sum is: "+sum);
//			
//			return sum;
//		}
//
//
//		public static void main(String[] args) {
//			// TODO Auto-generated method stub
//
//			Scanner input = new Scanner (System.in);
//			int a = input.nextInt(); 
//			int b = input.nextInt();
//			
//			int add= calculateSum (a,b);
//			System.out.println("Your addition is: "+add);
	
			
	
	//Ques:  Multiplication of the two number using FUNCTION	
	 
//	public static  float calculateMulti(float a, float b) {
//		//int x= (int) a;
//		//int y= (int) b;
//		float res = a*b;
//		return res;
//	}
//	
//	 public static void main(String[] args) {
//		 
//		Scanner input = new Scanner (System.in);
//		System.out.println("Enter 1st number: ");
//		float x = input.nextFloat();
//		System.out.println("Enter 2nd number: ");
//		float y= input.nextFloat();
//		
//		float ans = calculateMulti (x,y);
//		
//		System.out.println("Your answer is : "+ans);
	
	
	
	//Ques: Find the Factorial using FUNCTION
	
//	public static void factorail(float a) {
//		if (a<0) {
//			System.out.println("Invalid number");
//			return ;
//		}
//		
//		if (a==0) {
//			System.out.println("Factorial is: 1");
//			 
//			return;
//		}
//		
//		float res = 1;
//
//		for (float i = a; i >= 1; i--) {
//			res = res * i;
//		}
//		System.out.println("Factorail is: "+res);
//		return;
//	}
//
//	public static void main(String[] args) {
//
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter any number: ");
//		float n = input.nextFloat();
//
//		//System.out.println("Your factorial is: " + factorail(n));
//		factorail (n);
	
	
	

	//Ques: Write a function that takes in age as input and returns if that person is eligible
//	to vote or not. A person of age > 18 is eligible to vote.
	
//	public static int eligibiltyToVote(int a) {
//		
//		int res= (a>=18)? 1:0;
//		//System.out.println(res);
//		return res;
//		
////		if (a>=18) {
////			System.out.println("eligi to vote");
////		}
////		else {
////			System.out.println("not eligi to vote");
////		}
//		}
//	
//	public static void main(String[] args) {
//
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter any age: ");
//		int age = input.nextInt();
//		
//		//eligibiltyToVote(age);
//		 System.out.println(eligibiltyToVote(age));
	
	
	
//	public static void main(String[] args) {
//		
//		int arr[]= {2,2,2,3};
//		int brr[]= {2,2,2,5};
//		
//		for (int i =0; i<arr.length; i++) {
//			for(int j=0; j<brr.length;j++) {
//				frr[]= arr[i]^brr[j];
//			
//			}
	
	


}
	

