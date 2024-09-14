package array;

public class PrintIndexOfRepetedNumber {

	public static void main(String[] args) {
		int [] arrint = {7,6,0,4,5,7,9,7,3,2,7,1,8};
		int len = arrint.length;
		for(int i=0; i<len;i++) {
			int num= arrint[i];
			for(int j=0; j<len;j++) {
				if(num==arrint[j]) {
					System.out.println("Indexes of that "+num+" is "+j);
				}
			}
		}
	}
}
