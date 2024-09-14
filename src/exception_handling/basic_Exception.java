package exception_handling;

public class basic_Exception {
	

//	public static void main(String[] args) {
//		dostuff();
//
//	}
//	public static void dostuff() {
//		do_more_stuff();
//	}
//public static void do_more_stuff() {
//	   System.out.println("Hello: 1");
//		System.out.println(10/0);
//		System.out.println("Hello: 2");
//	}
	
	public static void main(String[] args) {
		System.out.println("main method 1");
		dostuff();
		System.out.println("main method 2");
		
		
	}
	
	
	public static void dostuff() {
		System.out.println("do stuff 1");
		do_more_stuff();
		
		System.out.println("do stuff 2");
		dostuff3();
		System.out.println("Its working");
	}
	public static void do_more_stuff() {
		System.out.println("do_more_stuff 1");
		
		try {
			System.out.println(10 / 0);
		}
		 
		catch ( ArithmeticException ae) {
			System.out.println(ae);
		}
          finally {
			
			System.out.println("Go farwoard");
		}
		
		System.out.println("do_more_stuff 2");
	}
	
	public static void dostuff3() {
		System.out.println("do stuff 4");
		System.out.println("do stuff 5");
	}

}
