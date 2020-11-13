package Triangles;

import java.util.Scanner;


public class Triangle_Test {
    public static void main(String[] args) {
        // Declare stdin so data can be read from input.

        Scanner scan = new Scanner(System.in);


        // loop exits when the user response is "n"
        String user_response = "y";
        while (!user_response.equals("n") ) {
            // Ask user for 3 dimensions of triangle.
            System.out.println("\nEnter side1 length: ");

            int side1 = Integer.parseInt(scan.next());

            System.out.println("Enter side2 length: ");
            int side2 = Integer.parseInt(scan.next());

            System.out.println("Enter side3 length: ");
            int side3 = Integer.parseInt(scan.next());

            Triangle tri = new Triangle(side1, side2, side3);


            // Determine what kind of triangle it is.
            System.out.println("\nIs triangle right-angle? " + tri.is_right());
            System.out.println("Is triangle scalene?     " + tri.is_scalene());
            System.out.println("Is triangle isosceles?   " +
                    tri.is_isosceles());
            System.out.println("Is triangle equilateral? " +
                    tri.is_equilateral());
            // Ask user if they want to continue.
            System.out.println("\nDo you want to examine more triangles?");
            System.out.println("(type 'y' for yes or 'n' for no)");

            user_response = scan.next();
        }
    }

}
