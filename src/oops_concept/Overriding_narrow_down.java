package oops_concept;
class A{
	void print() {
		System.out.println("print");
	}
}
public class Overriding_narrow_down extends A {
    // same access modifier (default -> default)
	
//	void print() {
//		System.out.println("print");
//	}
	
	// Having large scope modifier (default -> protected)
	
//	 protected void print() {
//		System.out.println("print");
//	}
	
	// Having large scope modifier (default -> Public)
	 public void print() {
			System.out.println("print");
		}
	 
	public static void main(String[] args) {
		

	}

}
