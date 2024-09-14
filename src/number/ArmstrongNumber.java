package number;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = input.nextInt();
		int n = num;
		int rem,res=0;
		while(n!=0) {
			rem = n%10;
			res= res+rem*rem*rem;
			n=n/10;
			}
		if(num==res) {
			System.out.println("Number is Armstrong");
			
		}
		else {
			System.out.println("Number is not Armstrong");
		}
		input.close();
	}

	

}
