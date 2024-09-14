package number;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter any number: ");
		int num = input.nextInt();
		 int a=0;
		 int b=1;
		 for(int i =0; i<num; i++) {
			 System.out.print(a + " ");
				int res = a + b;
				a = b;
				b = res;
			//	System.out.print(a + " ");
			}
		 	input.close();

		}

	}
