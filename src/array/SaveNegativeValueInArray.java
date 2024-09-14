package array;

public class SaveNegativeValueInArray {

	public static void main(String[] args) {
		 int arr[] = {-3,-5,-7,0,-9,54,23,5,8,-6,0,-2,13};
		 for (int negNum :arr) {
			 if (negNum<0) {
				 System.out.print(negNum+" ");
			 }
		}
		 System.out.println();
		 for(int posNum: arr) {
			 if (posNum>=0) {
				 System.out.print(posNum+" ");
			 }
		 }
	}
}	

