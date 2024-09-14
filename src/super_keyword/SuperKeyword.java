package super_keyword;
class A{
	int x =5;
	
	public void show () {
		System.out.println("Inside A show method");
	}
	A(){
		System.out.println("A constructor");
	}
	
	}
class C extends A {
	int y = 12;
	public void display () {
		show ();
	}
	public C () {
		System.out.println("class c constructor");
	}
	public C (int x) {
		System.out.println(x);
	}
	

}
class D extends C{
	
	public void print () {
	
		display();
		System.out.println(super.y);;
		
	}
	D(){
		//super();
		super (7);
	}
}

	
public class SuperKeyword{

	public static void main(String[] args) {
		D obj = new D();
//		System.out.println(obj.x);;
		obj.print();

	}

}
