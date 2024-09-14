package practise;
import java.util.Scanner;


class Rectangle {
	double length;
	double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double calculateArea() {
		double a = length * width;
	
		return a;
	}
	
}

	public class AssignmentofRectangle {

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			// Get the number of rectangles from the user
			System.out.print("Enter the number of rectangles: ");
			int numRectangles = scanner.nextInt();
// create an object of array, array size will define number of objects
			Rectangle[] rectangles = new Rectangle[numRectangles];

			// Input lengths and widths for each rectangle
			for (int i = 0; i < numRectangles; i++) {
				System.out.println("Rectangle " + (i + 1) + ":");
				System.out.print("Enter length: ");
				double length = scanner.nextDouble();
				System.out.print("Enter width: ");
				double width = scanner.nextDouble();
				rectangles[i] = new Rectangle(length, width);
				System.out.println(rectangles[i].calculateArea());
				
				

			}

		}
	}




