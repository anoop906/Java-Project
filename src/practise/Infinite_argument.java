package practise;
class A{
	 private int b=7;
	public static void add(int...a) {
		int sum= 0;
		for (int num :a) {
			sum = sum+ num;
		}
		System.out.println(sum);
	}
}

public class Infinite_argument {

	public static void main(String... args) {
		A obj = new A();
		obj.add(4,4,4,4,4,4,4,4,4,-4);
		
	}

}
