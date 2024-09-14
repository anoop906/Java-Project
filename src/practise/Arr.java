package practise;

import java.util.Scanner;



public class Arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number movies: ");
		int num = input.nextInt();
        String[] arr = new String[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the name of movie " + (i + 1) + ": ");
            arr[i] = input.nextLine();
        }

        System.out.println("Your movie list:");
        for (String movie : arr) {
            System.out.println(movie);
        }
    }
}



