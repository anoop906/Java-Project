package oops_concept;
class I{
	private void pen() {
		System.out.println("Pen");
	}
	void show() {
		
		System.out.println("Show");
		pen();
	}
}
public class Private_class {

	public static void main(String[] args) {
	I obj = new I();
	obj.show();
	
	}

}
