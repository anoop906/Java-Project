package oops_concept;

import java.util.Scanner;

class two_num{
	public static void add (int a, int b) {
		int res= a+b;
		System.out.print("addition of two number: "+res);
	}
}
class three_num extends two_num{
	public static void add (int a, int b, int c) {
		int res= a+b+c;
		System.out.print("addition of three number: "+res);
	}
}
class four_num extends two_num{
	public static void add (int a, int b, int c, int d) {
		int res= a+b+c+d;
		System.out.print("addition of four number: "+res);
	}
}
class five_num extends two_num{
	public static void add (int a, int b, int c, int d, int e) {
		int res= a+b+c+d+e;
		System.out.print("addition of five number: "+res);
	}
}

public class Methodoverriding_prbolem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter any number between 2 to 5: ");
		int num = scanner.nextInt();

		int arr[]=new int[num];
	
		for (int i = 0; i < num; i++) {
			
			System.out.print("Enter "+ (i+1)+" number: ");
			arr[i] = scanner.nextInt();
			
			
	}
		
		if (num==2) {
			two_num.add(arr[0],arr[1]);
		}
		else if (num==3) {
			three_num.add(arr[0],arr[1], arr[2]);
		}
		else if (num==4) {
			four_num.add(arr[0],arr[1], arr[2], arr[3]);
		}
		else if (num==5) {
			five_num.add(arr[0],arr[1], arr[2], arr[3],arr[4]);
		}
		
		
//		switch (num) {
//        case 2:
//           two_num.add(arr[0], arr[1]);
//            break;
//        case 3:
//            three_num.add(arr[0], arr[1], arr[2]);
//            break;
//        case 4:
//            four_num.add(arr[0], arr[1], arr[2], arr[3]);
//            break;
//        case 5:
//           five_num.add(arr[0], arr[1], arr[2], arr[3], arr[4]);
//            break;
//        default:
//            System.out.println("Invalid number of inputs.");
//            break;
//    }

	}
}