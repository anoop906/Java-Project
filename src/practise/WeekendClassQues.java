package practise;

import java.util.Scanner;

public class WeekendClassQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		// Q1: Check the no is odd or even
		
//		Scanner number= new Scanner (System.in);
//		System.out.print("Enter any no.: ");
//		int x = number.nextInt();
//		
//		if (x%2==0) {
//			System.out.println(x+": number is even ");
//		}
//		else {
//			System.out.println(x+ ": number is odd");
//		}
		
		
    //Q2. Check the number is Prime or not
		
//		Scanner prime= new Scanner (System.in);
//		System.out.print("Enter any no.: ");
//		int n = prime.nextInt();
//		
//		int z=0;
//		if (n==1 || n==0) {
//			System.out.println("no is neither prime nor composite." );
//			z=2;
//		}
//		for(int i=2; i<n;i++) {
//			if (n%i==0) {
//				z=1;
//				break;
//			}
		
		//Q.3 Check the year is leap or ordinary year
//		
//		Scanner year= new Scanner (System.in);
//		System.out.print("Enter any year: ");
//		int y = year.nextInt();
//		if (y%4==0 && (y%100!=0 ||y%400==0)) {
//			System.out.println(y+" : year is leap year");
//		}
//		else {
//			System.out.println(y+" : year is ordinary year");
//		}

		
		
		//Q1: Sum of all values of array
		
		
//		Scanner input =new Scanner (System.in);
//		System.out.print("Enter the size of array: ");
//		int x= input.nextInt();
//		
//		int values []= new int [x];
//		
//		for(int i=0; i<x; i++) {
//			System.out.print("Enter the " + (i + 1) + " element: ");
//			values[i]= input.nextInt();
//		}
//		System.out.println("-------------------*---------------------");
//		System.out.println("Your array is: ");
//		
//		System.out.print("[");
//		for(int i=0; i<values.length; i++) {
//	       System.out.print(values[i]+" ");
//			
//		}
//		System.out.print("]");
//		
//		System.out.println("\nTotal values of array is:");
//		int sum=0;
//		
//		for(int i=0; i<x; i++) {
//
//			sum=sum+values[i];
//			
//		}
//		System.out.print(sum+" ");
		
		
	//Q2:  Find the combination of all two numbers whose sum is six
		
		
//		int num []= {0,1,2,3,4,5,6};
//		for(int i=0; i<num.length; i++) {
//			for(int j=i+1; j<num.length; j++) {    //j=0 will repeat all value
//				if(num[i]+num[j]==6) {
//					System.out.println(num[i]+" "+num[j]);
//				}
//				
//			}
//		}
		
		
		//Q3 Arrange the given number in ascending order
		
//		Scanner input =new Scanner (System.in);
//		System.out.print("Enter the size of array: ");
//		int x= input.nextInt();
//		
//		int arr []= new int [x];
//		
//		//Enter the value of array
//		for(int i=0; i<arr.length; i++) {
//			System.out.print("Enter the " +(i+1)+" element: ");
//			arr[i] = input.nextInt();
//		}
//		System.out.print("\n----------------------*-----------------");
//		System.out.print("\n\nYour array is: ");
//		
//		
//		//print the array
//		System.out.print("\n[");
//		for(int i=0; i<arr.length; i++) {
//	       System.out.print(arr[i]+" ");
//			
//		}
//		System.out.print("]");
//		
//		//arrange the number of array
//		 for(int i=0; i<arr.length;i++) {
//			 int z=0;
//			 for(int j=0; j<arr.length-1; j++) {
//				 if(arr[j]>arr[j+1]) {
//					  z= arr[j];
//					 arr[j]=arr[j+1];
//					 arr[j+1]=z;
//					 
//				 
//				 }
//			 }  
//		 }
//		 System.out.print("\n----------------------*-----------------");
//		 System.err.print("\nYour shorted array is: ");
//		 System.err.print("\n[");
//		 
//		 //final print the array
//		 
//		 for (int f: arr) {
//			 System.err.print(f+" ");
//			 }
//		 System.err.print("]");
		 
		 
		//Shorting the array 
		
//		 		int a[]= {2,4,5,3,64,63,3};
//		 		for(int i=0;i<a.length;i++) {
//		 			int b=0;
//		 			for(int j=0;j<a.length-1;j++) {
//		 				//int b=a[j];
//		 			    //int c=a[j-1];
//		 				if(a[j]>a[j+1]) {    //swap the value by 
//		 				b=a[j];              //taking third variable
//		 				a[j]=a[j+1];
//		 				a[j+1]=b;
//		 				//System.out.println();
//		 				}
//		 			}
//		 		}
//		 		System.out.println("Sorted Array:");
//		 		for(int i=0;i<a.length;i++) {
//		 			System.out.print(a[i]+" ");
//		 		}
		
//		import java.util.Scanner;
//		class Add{
		//public static void main(String[]args){

		Scanner input= new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		int x = input.nextInt();
		System.out.print("Enter the 2nd  number: ");
		int y = input.nextInt();

		int c = x+y;
		System.out.println(c);
		 	
	   }
	
	}


	


