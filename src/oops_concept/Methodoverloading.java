package oops_concept;

//public class Methodoverloading {
//
//	public void main(String name) {
//		System.out.println("name: "+name);
//	}
//
//	public void main(char name) {
//		System.out.println("letter: "+name);
//	}
//
//	public void main(int year) {
//		System.out.println("year: "+year);
//	}
//
//	public void main(double largeNum) {
//		System.out.println("Large number: "+largeNum);
//	}
//
//
//	public static void main(String[] args) {
//		Methodoverloading obj = new Methodoverloading();
//		obj.main(435.73498095345);
//		obj.main(2024);
//		obj.main("anuj");
//		obj.main('c');
//	
//	}
//
//}

class Vehicle {
	public void main(int age) {
		System.out.println("kachra");
	}
}

class petrolcar extends Vehicle {
	public void main(char a) {
		System.out.println(a);
	}
}

class dieselcar extends petrolcar {
	public void main(boolean Y  ) {
		if( Y== true) {
		System.out.println("diesel_engine");
	}
		else {
			System.out.println("electric engine");
		}
}
}

class electriccar extends dieselcar {
	public void main(float num) {
		System.out.println("float number");
	}
}

public class Methodoverloading {
	public static void main(String[] args) {
		electriccar obj = new electriccar();
		obj.main(true);
		obj.main(false);
		obj.main(34f);
		obj.main('z');
		obj.main(22);

	}
}
