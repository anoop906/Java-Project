package practise;


public class Instance_variable {
	String election_no;
	int no_of_states;
	int no_ut;

	public void info(int x, int y, String name) {

		this.no_of_states = x;
		this.no_ut = y;
		this.election_no = name;

	}

	public void print() {
		System.out.println(election_no);
		System.out.println(no_of_states);
		System.out.println(no_ut);

	}

	public static void main(String[] args) {
		Instance_variable obj = new Instance_variable();
		obj.info(28, 8, "18th Loksabha election");
		obj.print();
		
		

	}

}
