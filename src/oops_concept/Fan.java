package oops_concept;

 abstract class air {
	
	 void warm_air() {
		 System.out.println("warm air");
	 }
	 void cold_air() {
		 System.out.println("cold air");
	 }
	 void normal_air() {
		 System.out.println("normal air");
	 }
	 public abstract void ac();
}
	 
class Fan extends air{
	

	public static void main(String[] args) {
		Fan obj = new Fan();
		obj.cold_air();
		obj.warm_air();
		obj.normal_air();
		obj.ac();
	}

	@Override
	public void ac() {
	System.out.println("Set temp accordingly");
		
	}

	
		
	

}
