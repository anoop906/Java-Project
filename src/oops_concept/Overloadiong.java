package oops_concept;
class adder{
	public static void add (int a, int b) {
		System.out.println(a+b);
	}
	public static void add (int a, int b,int c) {
		System.out.println(a*b*c);
	}
}
public class Overloadiong {

	public static void main(String[] args) {
		adder.add(5, 7);
		adder.add(5, 6, 7);
		

	}

}
