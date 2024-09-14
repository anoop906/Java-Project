package practise;

import java.util.Scanner;

public class method {

	public static void info (int age) {
		System.out.println(age);
	}
	
	public static void info (String name) {
		System.out.println(name);
	}
	
	public static void info (int age, String name) {
		System.out.println(name+" "+ age);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int age = input.nextInt();
		String name = input.nextLine();
		
		 info (age);
		 
	}

}

