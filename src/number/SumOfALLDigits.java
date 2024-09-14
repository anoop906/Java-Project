package number;

import java.util.Scanner;

public class SumOfALLDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num = input.nextInt();
		int n= num;
		int rem,res=0;
		while(n!=0) {
			rem= n%10;
			res= res+rem;
			n=n/10;
		}
		System.out.println("Total of all digits is: "+res);
		 //Again sum of answer's digit
		int p= res;
		int rem1,res1=0;
		while (p!=0) {
				rem1= p%10;
				res1= res1+rem1;
				p=p/10;
			}
		System.out.println("Again sum of answer's digit: "+ res1);
		
		}
		
		
	}


