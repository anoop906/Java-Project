package final_keyword;

class AA{
	
	public final int a= 42;
	
	public final void show () {
		System.out.println("Inside AA show method");
	}
	void print () {
		System.out.println("Inside AA print method");
	}
}
public class Final_method extends AA{
	// since it is final method, it can not overridden
//	public final void show () {
//		System.out.println("Inside AA show method");
//	}
	void print () {
		System.out.println("Inside Final_method class print method");
	}
	
	
	public static void main(String[] args) {
		AA obj = new Final_method ();
		System.out.println(obj.a);
		obj.show();
		obj.print();

	}

}
