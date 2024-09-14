package oops_concept;

class moon{
	int a =7;
	char c= 'A';
	public void show () {
		System.out.println("Inside moon show");
	}
	
			
}
public class Overriding extends moon{
	public void show () {
		System.out.println("Inside overriding show");
	}

	public static void main(String[] args) {
		moon obj = new Overriding();
		System.out.println(obj.a);;
		System.out.println(obj.c);;
		obj.show();

	}

}
