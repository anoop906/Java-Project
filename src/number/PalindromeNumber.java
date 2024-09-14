package number;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = input.nextInt();
		int n = num;
		int rem,rev=0;
		while(n!=0) {
			rem = n%10;
			rev= rev*10+rem;
			n=n/10;
			}
		if(num==rev) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrom");
		}
		
      input.close();
	}

}
