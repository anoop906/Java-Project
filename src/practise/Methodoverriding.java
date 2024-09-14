package practise;
import java.util.*;

class shape{
	int length;
	 int width;
	 
	public double perimeter () {
		return  (2*(length+width));
	}
}
class rectangles extends shape{
	
	public rectangles (int length, int width){
        this.length = length;
        this.width= width;
	 }
	
	public double area () {
        int res = length*width;
	return res ;
}
	}

public class Methodoverriding {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter length: ");
		int length= input.nextInt();
		System.out.print("Enter width: ");
		int width= input.nextInt();
		rectangles obj = new rectangles (length,width);
		obj.area();
		System.out.println("Area of rectangle is: "+obj.area());
		System.out.println("Perimeter is: "+obj.perimeter());
	

	}

}
