package static_concept;
class Adder{
	 static int add (int a, int b) {
		return a+b;
	}
	  int add (int a,int b, int c ) {
		System.out.println(add(90, 150));  
		 return a+b+c;
	 }
}
class subtractor extends Adder {
	static int add (int a, int b) {
		return a+b;
	}
	int add (int a, int b, int c,int d) {
		System.out.println(add(100,100));;
	return a+b+c+d;	
	}
}

public class TestOverloading {

	public static void main(String[] args) {
		System.out.println(Adder.add(5, 7));
		System.out.println(subtractor.add(16, 10));
		
		Adder obj = new subtractor();
		System.out.println(obj.add(18,19,20));
		
		
		//jis class ke naam se call karoge usi ka method aayega
		//method is not replace both method co-exited as per class
		System.out.println(Adder.add(9, 10));
		System.out.println(subtractor.add(6, 10));

	}

}

//class Adder {
//	void show(int a, int b) {
//		System.out.println(a + b);
//	}
//
//	void print(int a, int b) {
//		show(5, 7);
//		System.out.println(a + b);
//	}
//}
//
//public class TestOverloading {
//	public static void main(String[] args) {
//		Adder obj = new Adder();
//		obj.print(10, 10);
//	}
//
//}
