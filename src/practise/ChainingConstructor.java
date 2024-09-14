package practise;

//Chaining Constructor:

class Chaining { // 1st class

	Chaining() {
		this(22);
		System.out.println("Default constructor");
	}

	Chaining(int x) {
		this("Laptop", 40000);
		System.out.println("1st parameterized constructor: " + x);
	}

	Chaining(String name, int price) {
		// this(115); try to create duplicate with different variable name
		this("Hello");
		System.out.println("2nd parameterized constructor:");
		System.out.println("Product name: " + name + " & Price of the product: " + price);
	}
	// Chaining(int y){ unable to create the duplicate
	// }

	Chaining(String name) {
		this(8, 180);
		System.out.println(name);
	}

	Chaining(int x, int y) {
		int res = x * y;
		System.out.println("How many hrs of (8*180): " + res);

	}
}

public class ChainingConstructor { // 2nd class that is Main class

	public static void main(String args[]) {
		new Chaining(); // constructor also can be created like this
		// Chaining object = new Chaining();
	}

//Constructor chaining can be achieved in any order:

//public class ChainingConstructor {
//
//	// default constructor 1
//	ChainingConstructor() {
//		System.out.println("default");
//	}
//
//	// parameterized constructor 2
//	ChainingConstructor(int x) {
//		// invokes default constructor
//		this();
//		System.out.println(x);
//	}
//
//	// parameterized constructor 3
//	ChainingConstructor(int x, int y) {
//		// invokes parameterized constructor 2
//		this(5);
//		System.out.println(x * y);
//	}
//
//	public static void main(String args[]) {
//		// invokes parameterized constructor 3
//		new ChainingConstructor(8, 10); // constructor can be made like this
//
}
