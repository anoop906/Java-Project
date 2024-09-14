package practise;

class revision {
	revision() {
		this(28, "States");
		System.out.println("Default Constructor");
	}
	revision (String name, int year){
		this ();
		System.out.println(name+" "+ year);
	}
	revision (int num, String states ){
		System.out.println(num+ " "+ states);
	}
	
}

public class Constructor_Assignment {

	public static void main(String[] args) {
		revision obj= new revision("18th Loksabha election", 2024);

	}

}
