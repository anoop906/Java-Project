package practise;

import java.util.Scanner;

public class RegularClassQues {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	
			//Case1: Q1. Reverse the number
			
	//		Scanner input = new Scanner (System.in);
	//		System.out.print("Enter the number: ");
	//		int num = input.nextInt();
	//		 int r;
	//		while(num!=0) {
	//			r=num%10;
	//			System.out.print("Your reverse number is: "+r);
	//			num=num/10;
	//		}
			
			
			 //Case2: Q1. Reverse the number
			
	//		Scanner input = new Scanner (System.in);
	//		System.out.print("Enter the number: ");
	//		int num = input.nextInt();
	//		 int r;
	//		 int rev=0;
	//		 while(num!=0) {
	//			 r = num%10;
	//			 rev= rev*10+r;
	//			 num=num/10;
	//			
	//		 }
	//		 System.out.print("Your reverse number is: "+rev);
			 
			 //Q2. Check the number is palindrome  number or not
			 
	//		 Scanner input = new Scanner (System.in);
	//			System.out.print("Enter the number: ");
	//			int num = input.nextInt();
	//			
	//			int n =num;
	//			 int r;
	//			 int rev=0;
	//			 while(n!=0) {
	//				 r = n%10;
	//				 rev= rev*10+r;
	//				 n=n/10;
	//			 }
	//			 if (rev==num) {
	//				 System.out.println("Number is palindrom no.");
	//			 }
	//			 else if (rev!=num){
	//				 System.out.println("Number is not palindrom no."); 
	//			 }
			
			//Q3. Check Armstrong number
			
	//		 Scanner input = new Scanner (System.in);
	//			System.out.print("Enter the number: ");
	//			int num = input.nextInt();
	//			
	//			int n =num;
	//			 int r;
	//			 int rev=0;
	//			 while(n!=0) {
	//				 r = n%10;
	//				 rev= rev*10+r*r*r;
	//				 n=n/10;
	//			 }
	//			System.out.println("Number is Armstrong no.");
			 
			//Q4. Find the sum of all numbers which are given
		
	//			Scanner input = new Scanner (System.in);
	//			System.out.print("Enter the number: ");
	//			int num = input.nextInt();
	//			
	//			int n =num;
	//			 int r;
	//			 int sum=0;
	//			 while(n!=0) {
	//				 r = n%10;
	//				 sum= sum+r;
	//				 n=n/10;
	//			 }
	//			System.out.println("Sum of the numbers is: "+sum);
		
				
			//Q5. Find the factorial of given number
				
	//			Scanner input = new Scanner (System.in);
	//			System.out.print("Enter any number which factorial you want: ");
	//			int n = input.nextInt();
	//			
	//			int mul=1;
	//			 for (int i=n; i>=1; i--) {
	//				 mul=mul*i;
	//				
	//			 }
	//			 System.err.println("Factorial of that number is: "+mul);
			
			
			// Ques: Find the sum of even number
			
	//		Scanner input= new Scanner(System.in);
	//		System.out.print("Enter the number up to which you want the sum of even number: ");
	//		int n = input.nextInt();
	//          
	//		int sum=0;
	//		for(int i=2; i<=n; i+=2) {
	//			sum= sum+i;
	//		}
	//		 System.out.println("Total sum is: "+sum);
			 
			//Ques: Find the sum of odd number
			 
	//		 Scanner input= new Scanner(System.in);
	//			System.out.print("Enter the number up to which you want the sum of odd number: ");
	//			int n = input.nextInt();
	//	          
	//			int sum=0;
	//			for(int i=1; i<=n; i+=2) {
	//				sum= sum+i;
	//			}
	//			 System.out.println("Total sum is: "+sum);
				 
			
	// Ques: Compare two number using Ternary Operator
			
	//		 Scanner input= new Scanner(System.in);
	//			System.out.print("Enter the 1st number: ");
	//			int a = input.nextInt();
	//			System.out.print("Enter the 2nd number: ");
	//			int b = input.nextInt();
	//			
	//			int result = (a<b)?a:b; //condition ? if true : if false
	//			                        //condition ? if true : else
	//			System.out.println("Your number is : "+result);
			
	
			
	//Ques: Compare three numbers using Ternary operator
			
			
	//		  Scanner input= new Scanner(System.in);
	//		  System.out.print("Enter the 1st number: "); 
	//		  int a = input.nextInt();
	//		  System.out.print("Enter the 2nd number: "); 
	//		  int b = input.nextInt();
	//		  System.out.print("Enter the 3rd number: "); 
	//		  int c = input.nextInt();
	//		  
	//		  int result = (a > b && a > c) ? a : (b > c) ? b : c; 
	//		  //int result = (a < b) ?(a < c) ? a : c : (b < c) ? b : c; 
	//		  System.out.println("Largest number is: "+result);
	
			
	//Ques: Swap the two value using XOR operator 
			
	//		  Scanner input= new Scanner(System.in);
	//		  System.out.print("Enter the 1st number: "); 
	//		  int a = input.nextInt();
	//		  System.out.print("Enter the 2nd number: "); 
	//		  int b = input.nextInt();
	//		  
	//			a = a ^ b;
	//			b = a ^ b;
	//			a = a ^ b;
	//			
	//			System.out.println("1st number is: "+a);
	//			System.out.println("2nd number is: "+b);
			
//Ques: Find the Unique number using XOR operator
			
	//		int arr[]= {1,2,3,5,6,4,3,2,1,7,8,9,5,0,8,6,9,0,7};
	//		int res=0;
	//		for(int i=0; i<arr.length; i++){
	//		res= res^arr[i];
	//		}
	//		System.out.println("Unique number is: "+res);
			
//Ques: Find the Missing number using XOR operator
			
			
	//		 int arr[] = {1,2,3,4,5,6,8,9}; 
	//		 int res = arr[0];  
	//		 int b = 1;  
	//		 for (int i = 0; i < arr.length; i++) { 
	//			 res = res ^ arr[i];
	//			 }
	//		  
	//		  for (int j = 0; j <= arr.length + 1; j++) 
		//{ 
		//b = b ^ j;
	//		  
	//		  }
	//		  
	//		  
	//		  System.out.println("Missing no is: "+(res ^ b));
			 
			
//Ques: 		
			
	//		  Scanner input= new Scanner(System.in);
	//		  System.out.print("Enter the number where you want to start: "); 
	//		  int a = input.nextInt();
	//		  System.out.print("Enter the last number where you want to end: "); 
	//		  int n = input.nextInt(); 
	//		  System.out.print("Enter the difference between two consecutive number: "); 
	//		  int d = input.nextInt();
	//		  
	//		  int arr[] = new int [n];
	//		  int brr[]= new int [];
	//		
	//		for(int i=0;)
			
	
		
//	1. Write a program to find maximum between two numbers
		
//		Scanner input = new Scanner (System.in);
//		System.out.print("Enter the 1st number: ");
//		int a = input.nextInt();
//		System.out.print("Enter the 2nd number: ");
//		int b = input.nextInt();
//		
//		int res= (a>b)?a:b;
//		System.out.print("Maximum number is: "+res);
		
//2. Write a program to find maximum between three numbers
		
//		Scanner input = new Scanner (System.in);
//		System.out.print("Enter the 1st number: ");
//		int a = input.nextInt();
//		System.out.print("Enter the 2nd number: ");
//		int b = input.nextInt();
//		System.out.print("Enter the 3rd number: ");
//		int c = input.nextInt();
//		
//		int res= (a>b)?(a>c)?a:c:(b>c)?b:c;
//		System.out.print("Maximum number is: "+res);
//		

		
//3. Write a program to check whether a number is negative, positive or zero
		
//		Scanner input = new Scanner (System.in);
//		System.out.print("Enter the number: ");
//		int a = input.nextInt();
//		
//		String res= (a==0)?"Zero number":(a>0)?"Positive number":"Negative Number";
//		System.out.println("Your have entered the: "+res);
//		
		
//4. Write a program to check whether a number is divisible by 5 and 11 or not
		
//	Scanner input = new Scanner(System.in);
//	System.out.print("Enter the number: ");
//	int a = input.nextInt();
//
//	String res = (a % 5 == 0 && a % 11 == 0) ? "Number is divisible by 5 and 11"
//			: "Number is not divisible by 5 and 11";
//	System.out.println(res);
		
		
//5. Write a program to check whether a number is even or odd
		
//		Scanner input = new Scanner (System.in);
//		System.out.print("Enter the number: ");
//		int a = input.nextInt();
//		
//		String res= (a%2==0)?"Number is Even":"Number is Odd";
//		System.out.println(res);
		

//6. Write a program to check whether a year is leap year or not
	
//		Scanner input = new Scanner (System.in);
//		System.out.print("Enter the year: ");
//		int year = input.nextInt();
//		
//		String res = (year % 4 == 0 && year % 100!=0 || year % 400== 0) ? "Leap Year" : "Ordinary year";
//		System.out.println(res);
		
		
//7. Write a program to check whether a character is alphabet or not
		
//		Scanner input = new Scanner (System.in);
//		System.out.print("Enter the anything: ");
//		char c = input.next().charAt(0);
//		
//		String res = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ? "Character is alphabet" : "Character is not alphabet";
//		System.out.println(res);

		
//8. Write a program to input any alphabet and check whether it is vowel or consonant
		
//	Scanner input = new Scanner(System.in);
//	System.out.print("Enter the any alphabet");
//	char letter = input.next().charAt(0); 
//	char vowels[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
//        int flag =0;
//        //No direct array compare possible in 'if' condition
//	for (char vowel : vowels) {
//		if (vowel == letter) {
//			
//			flag=1;
//			break;
//		} 
//	}
//		if (flag==1) {
//			System.out.println("letter is vowel");
//		}
//		else {
//			System.out.println("Letter is not vowel");
//		
//	}
		
		
		
//9. Write a program to input any character and check whether it is alphabet, digit or special character

//		Scanner input = new Scanner(System.in);
//
//		System.out.print("Enter anything: ");
//		char key = input.next().charAt(0);
//
//		if ((key>= 'a' && key<= 'z') || (key>= 'A' && key<= 'Z')) {
//			System.out.println("It is a Alphabet");
//		} 
//		else if ((key>= 33 && key<= 47)||(key>= 58 && key<= 64)||(key>= 91 && key<= 96)||(key>= 123 && key<= 126))
//        {
//			System.out.println("It is a Special character");
//		} 
//        else 
//        {
//			System.out.println("It is a Number");
//		}
//		
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter anything: ");
//		long number = input.nextLong();
//		if (number >= -9223372036854775808L && number <= 9223372036854775806L) {
//		System.out.println("You have entered the number: "+number);
//		}
//		char alphabet = input.next().charAt(0);
//		 if((alphabet>='a' && alphabet<='z')||(alphabet>='A' && alphabet<='Z')) {
//		
//		System.out.println("Special character is: "+alphabet);
//		}

	
//10. Write a program to check whether a character is uppercase or lowercase alphabet
	
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the any alphabet: ");
//		char alphabet = input.next().charAt(0);
//		
//		String res = (alphabet >= 'a' && alphabet <= 'z') ? "Lowercase Alphabet" : "Uppercase alphabet" ;
//		System.out.println(res);
		
//11. Write a program to input week number and print week day
		
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter any number: ");
//		int n = input.nextInt();
//		
//		switch (n) {
//		
//		case 1: 
//			System.out.println("Monday");
//		break;
//		
//		case 2: 
//			System.out.println("Tuesday");
//		break;
//		
//		case 3: 
//			System.out.println("Wednesday");
//		break;
//		
//		case 4: 
//			System.out.println("Thursday");
//		break;
//		
//		case 5: 
//			System.out.println("Friday");
//		break;
//		
//		case 6: 
//			System.out.println("Saturday");
//		break;
//		
//		case 7: 
//			System.out.println("Sunday");
//		break;
//		
//		default: 
//			System.out.println("Invalid number");
//		
//		}


//		12. Write a program to input month number and print month Name

//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter any number: ");
//		int n = input.nextInt();
//		
//		switch (n) {
//		
//		case 1: 
//			System.out.println("January");
//		break;
//		
//		case 2: 
//			System.out.println("February");
//		break;
//		
//		case 3: 
//			System.out.println("March");
//		break;
//		
//		case 4: 
//			System.out.println("April");
//		break;
//		
//		case 5: 
//			System.out.println("May");
//		break;
//		
//		case 6: 
//			System.out.println("June");
//		break;
//		
//		case 7: 
//			System.out.println("July");
//		break;
//		
//		case 8: 
//			System.out.println("August");
//		break;
//		case 9: 
//			System.out.println("September");
//		break;
//		case 10: 
//			System.out.println("October");
//		break;
//		case 11: 
//			System.out.println("November");
//		break;
//		case 12: 
//			System.out.println("December");
//		break;
//		
//		default: 
//			System.out.println("Invalid number");
//		
//		}


		
		//	13. Write a program to count total number of notes in given amount
		
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter any amount: ");
//		int amt = input.nextInt();
//		
//		int n500, n200, n100, n50, n20, n10, n5, n2, n1;
//		n500 = n200 = n100 = n50 = n20 = n10 = n5 = n2 = n1 = 0;
//		int sum=0;
//		int total_amt=0;
//
//		if (amt >= 500){ 
//			n500 = amt / 500;
//			amt = amt - (n500 * 500);
//			System.out.println(n500+"x500 = "+n500*500);
//			}
//		 
//		 if (amt >= 200) {
//			n200 = amt / 200;
//			amt = amt - (n200 * 200);
//			System.out.println(n200+"x200 = "+n200*200);
//		 }
//		 
//		 if (amt >= 100) {
//			n100 = amt / 100;
//			amt = amt - (n100 * 100);
//			System.out.println(n100+"x100 = "+n100*100);
//		 }
//		
//		 if (amt >= 50) { 
//			n50 = amt / 50;
//			amt = amt - (n50 * 50);
//			System.out.println(n50+"x50 = "+n50*50);
//		 }
//			
//		 if (amt >= 20) {
//			n20 = amt / 20;
//			amt = amt - (n20 * 20);
//			System.out.println(n20+"x20 = "+n20*20);
//		 }
//			
//		 if (amt >= 10) {
//			n10 = amt / 10;
//			amt = amt - (n10 * 10);
//			System.out.println(n10+"x10 = "+n10*10);
//		 }
//			
//		 if (amt >= 5) {
//			n5 = amt / 5;
//			amt = amt - (n5 * 5);
//			System.out.println(n5+"x5 = "+n5*5);
//		 }
//			
//		 if (amt >= 2) {
//			n2 = amt / 2;
//			amt = amt - (n2 * 2);
//			System.out.println(n2+"x2 = "+n2*2);
//		 }
//			
//		 if (amt >= 1){ 
//			n1 = amt / 1;
//			amt = amt-(n1 * 1);
//		System.out.println(n1+"x1 = "+n1*1);
//		}
//		
//		 System.out.println("---------------------------------------------");
//		  sum = n500 + n200 + n100 + n50 + n20 + n10 + n5 + n2 + n1;
//		  total_amt = (n500 * 500) + (n200 * 200) + (n100 * 100) + (n50 * 50) + (n20 * 20) + (n10 * 10) + (n5 * 5)
//				+ (n2 * 2) + (n1 * 1);
//		System.out.println("Total notes: "+sum+" = Total amount: "+total_amt);
		
		
		//		14. Write a program to input angles of a triangle and check whether triangle is valid or not
		
//	Scanner input = new Scanner(System.in);
//	System.out.print("Enter the 1st angle of triangle: ");
//	int a = input.nextInt();
//	System.out.print("Enter the 2nd angle of triangle: ");
//	int b = input.nextInt();
//	System.out.print("Enter the 3rd angle of triangle: ");
//	int c = input.nextInt();
//
//	String res = ((a + b + c) == 180) ? "Valid Triangle" : "Invalid Triangle";
//	System.err.println( res);


		
		//15. Write a program to input all sides of a triangle and check whether triangle is valid or not

		
//			Scanner input = new Scanner(System.in);
//	System.out.print("Enter the 1st side of triangle: ");
//	int a = input.nextInt();
//	System.out.print("Enter the 2nd side of triangle: ");
//	int b = input.nextInt();
//	System.out.print("Enter the 3rd side of triangle: ");
//	int c = input.nextInt();
//	
//	String res = (a+b)>c || (b+c)>a || (c+a)>b? "Valid Triangle":"Invalid Triangle";
//	System.err.println( res);
	

		
		//		16. Write a program to check whether the triangle is equilateral, isosceles or scalene triangle
		
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the 1st angle of triangle: ");
//		int a = input.nextInt();
//		System.out.print("Enter the 2nd angle of triangle: ");
//		int b = input.nextInt();
//		System.out.print("Enter the 3rd angle of triangle: ");
//		int c = input.nextInt();
//	
//		if((a == b)&&(b==c)&&(c==a)) {
//			System.out.println("\n Equilateral Triangle");
//			}
//			else if ((a == b) || (b == c) || (a == c)) {
//				System.out.println("\n Isosceles Triangle");
//			}
//			else  {
//			 System.out.println("\n Scalene Triangle");
//			}
		
		
//		17. Write a program to find all roots of a quadratic equation
		
//		System.out.println("Quadretic equation is like: ax^2+bx=c");
//		System.out.println("--------------------------------------");
//		Scanner input = new Scanner(System.in);
//		System.out.print("\nEnter the coefficient of x^2: ");
//		double a = input.nextDouble();
//		System.out.print("Enter the coefficient of x: ");
//		double b = input.nextDouble();
//		System.out.print("Enter the constant value: ");
//		double c = input.nextDouble();
//		
//		
//		  
//		double d = ((b * b) - (4 * a * c)); 
//		double x1, x2;
//		
//
//		if (d == 0) {
//			
//			x1 = x2 = (-b) / (2 * a);
//			System.out.print("\n Roots are real and equal: " + x1 + ", " + x2);
//		} 
//		
//		else if (d > 0) {
//			 x1 = ((-b) + Math.sqrt(d)) / (2 * a); //Math.sqrt double datatype ke saath aata hai
//			 x2 = ((-b) - Math.sqrt(d)) / (2 * a);
//			System.out.print("\n Roots are real and distinct: " + x1 + ", " + x2);
//		} 
//		
//		else if (d < 0) {
//			System.out.println("\nRoots are imaginary");
//		}
		
		
		
//18. Write a program to calculate profit or loss
		
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the cost-price of object: ");
//		float cp = input.nextFloat();
//		System.out.print("Enter the selling-price of object: ");
//		float sp = input.nextFloat();
//		
//		double profit = ((sp-cp)/cp)*100;
//		
//		double loss= ((cp-sp)/cp)*100;
//		
//		if (sp>cp) {
//			System.out.println("\nYour profit is: "+profit+"%");
//		}
//		else if (cp>sp) {
//			System.out.println("\nYour loss is: "+loss+"%");
//		}
//		else if (cp==sp) {
//			System.out.println("\nNo Pofit No loss");
//		}
		
		
//19. Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:

//Percentage >= 90% : Grade A
//Percentage >= 80% : Grade B
//Percentage >= 70% : Grade C
//Percentage >= 60% : Grade D
//Percentage >= 40% : Grade E
//Percentage < 40% : Grade F

		
	String subname []= {"Physics","Chemistry","Biology","Mathematics","Computer"};
	double marks[]=  new double [5];
	Scanner input = new Scanner(System.in);
	for(int i=0; i<marks.length; i++) {
		System.out.print("Enter your marks of "+subname[i]+": "); //sub ka naam bhi dikhe
		marks[i]= input.nextDouble();
	}
	System.out.println(" Your marks are:");
	for (int i=0; i<marks.length;i++) {
		
		System.out.println("\n"+subname[i]+":"+marks[i]);
	}
	
	double sum=0;
	
	for (int i=0; i<marks.length;i++) {
		
		 sum = sum + marks[i];
		
	}
	double res = (sum/5);
		 
               // one can print this using array and for 
		 
		 
	if ( res >= 90) {
		System.out.print("\n Grade A: "+ res+"%");
	}
	else if ( res >= 80) {
		System.out.print("\n Grade B: "+ res+"%");
	}
	else if ( res >= 70) {
		System.out.print("\n Grade C: "+res+"%");
	}
	else if ( res >= 60) {
		System.err.print("\n Grade D: "+res+"%");
	}
	else if ( res >= 40) {
		System.err.print("\n Grade E: "+res+"%");
	}
	else if ( res < 40) {
		System.err.print("\n FAIL: "+res+"%");
	}
	
	
	
	
	
	
	
//	20. Write a program to input basic salary of an employee and calculate its Gross salary according to following:
//
//		Basic Salary <= 10000 : HRA = 20%, DA = 80%
//		Basic Salary <= 20000 : HRA = 25%, DA = 90%
//		Basic Salary > 20000 : HRA = 30%, DA = 95%
	
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter Your salary amount: ");
//		double Basic_salary = input.nextDouble();
//
//		double HRA, DA, Gross_salary;
//		HRA = DA = Gross_salary = 0;
//
//		if (Basic_salary <= 10000) {
//			HRA = (20 * Basic_salary) / 100;
//			DA = (80 * Basic_salary) / 100;
//			}
//
//		else if (Basic_salary <= 20000) {
//			HRA = (25 * Basic_salary) / 100;
//			DA = (90 * Basic_salary) / 100;
//		}
//		 
//		else if (Basic_salary > 20000) {
//			HRA = (30 * Basic_salary) / 100;
//			DA = (95 * Basic_salary) / 100;
//		}
//		
//		Gross_salary = Basic_salary + HRA + DA;
//		System.out.print("Your Gross Salary is : " + Gross_salary);
		

	
		

//21. Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:
//
//For first 50 units Rs. 0.50/unit
//For next 150 units Rs. 0.75/unit
//For next 250 units Rs. 1.20/unit
//For unit above 250 Rs. 1.50/unit
//An additional surcharge of 20% is added to the bill
		
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter Your electric unit: ");
//		double unit= input.nextDouble();
//		
//		double bill,amount,surcharge;
//		bill=amount=surcharge=0;
//		
//		if(unit<=50) {
//			bill = unit*0.50;
//			
//			
//		}
//		
//		else if(unit>50 && unit<=150) {
//    
//			bill = ((unit-50)*0.75) +(50*0.50) ;
//			
//		}
//		 if(unit>150 && unit<=250) {
//			bill = (unit-150)*1.20 + (100*0.75) +(50*0.50) ;
//
//			
//		}
//		else if(unit>250) {
//			bill = ((unit-250)*1.50)+ (100*1.20) + (100*0.75) + (50*0.50) ;
//			
//			
//		}
//				surcharge = (bill * 20) / 100;
//		amount = bill + surcharge;
//		System.out.println("Your total bill is: " + amount + "/- Rupees");
		
		
	//Ques: Taking different type data from user and print.
		
//		   Scanner sc = new Scanner(System.in);
//		   
//	        // String input
//	        String name = sc.nextLine();
//	 
//	        // Character input
//	        char gender = sc.next().charAt(0);
//	 
//	        // Numerical data input
//	        // byte, short and float can be read
//	        // using similar-named functions.
//	        int age = sc.nextInt();
//	        long mobileNo = sc.nextLong();
//	        double cgpa = sc.nextDouble();
//	 
//	        // Print the values to check if the input was
//	        // correctly obtained.
//	        System.out.println("Name: " + name);
//	        System.out.println("Gender: " + gender);
//	        System.out.println("Age: " + age);
//	        System.out.println("Mobile Number: " + mobileNo);
//	        System.out.println("CGPA: " + cgpa);
	
		
	}
}
		


	
		
		
		

		
		
		
		
			 
		   
			 
		 
	


