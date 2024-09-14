package concept;

public class UnaryProgramme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int i=2;
       int temp;
       temp= i++ + ++i +i++;
       System.out.println(temp); //10
       System.out.println(i);   //5
	}

}
