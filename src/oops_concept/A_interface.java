package oops_concept;
public interface A_interface {
	static void pen() {
		return ;
	} 
	 static void pen3() {
		pen();
		return ;
	}
  default void pen1() {
		 System.out.println();
		 pen2();
		 pen1();
		 pen();
		 pen3();
		 print();
		 pen4();                                                                         
			}
	 private static void pen2() {
			System.out.println("pen2 private method");
			}
	 strictfp static void pen4() {  //strict fp: floating point
			System.out.println("pen2 private method");}
	public void print();
	
	
	
}



