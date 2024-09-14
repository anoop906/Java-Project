package final_keyword;

final class BB{
	int a =8;
	public static final void show () {
		System.out.println("Inside AA show method");
	}
	void print () {
		System.out.println("Inside AA print method");
	}
	void hello() {
		System.out.println("Inside AA hello method");
	}
}

//class AA can not extended because it is final 
// and inside all the method is by default final method
public class FinalClass {

	public static void main(String[] args) {
		

	}

}
