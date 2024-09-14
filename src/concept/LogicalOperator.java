package concept;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=4;
		int y=3;
		System.out.println(x==4 && y==3);
		System.out.println(x==4 || y==3);
		
		System.out.println(x==14 && y==3);
		System.out.println(x==14 || y==3);
		
		System.out.println(x==14 && y==13);
		System.out.println(x==14 || y==13);
		
		System.out.println(x==4 && y==13);
		System.out.println(x==4 || y==13);
	}

}
