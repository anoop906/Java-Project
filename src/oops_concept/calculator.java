package oops_concept;

//public class calculator {
//	double a;
//	double b;
//	calculator (double a, double b){
//		this.a=a;
//		this.b=b;
//		
//	}
//	public float cal
//
//	public static void main(String[] args) {
//		
//
//	}
//
//}


import java.util.*;

public class calculator {
public int ver(int a, int b) {
	return a+b;
}
public double ver(double a, double b) {
	return a-b;
}
public float ver(float a,float b) {
	return a*b;
}
public long ver(long a, long b) {
	return a/b;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first value in integer : ");
		int a=sc.nextInt();
		System.out.println("Enter first value in decimal : ");
		float b=sc.nextFloat();
		System.out.println("Enter first value in decimal : ");
		double c=sc.nextDouble();
		System.out.println("Enter first value in integer : ");
		long d =sc.nextLong();
		System.out.println("Enter second value in integer : ");
		int e=sc.nextInt();
		System.out.println("Enter second value in decimal : ");
		float f=sc.nextFloat();
		System.out.println("Enter second value in decimal : ");
		double g=sc.nextDouble();
		System.out.println("Enter second value in integer : ");
		long h =sc.nextLong();
		
		calculator obj=new calculator();
		System.out.println("Addition: "+obj.ver(a, b));
		System.out.println("Subtracion: "+obj.ver(c, d));
		System.out.println("Multiplication: "+obj.ver(e, f));
		System.out.println("Division: "+obj.ver(g, h));
		}
	}
