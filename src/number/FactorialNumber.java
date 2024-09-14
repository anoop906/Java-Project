package number;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any number to calculate  factorial: ");
		int num = input.nextInt();
		int fact =1;
		
		for(int i= num; i>=1; i-- ) {
			fact= fact*i;
//			System.out.print(i);
//			if (i>1) {
//				System.out.print("x");
//				
//			}
		}
		System.out.println("Factorial is: "+fact);
		
		input.close();

	}

}
