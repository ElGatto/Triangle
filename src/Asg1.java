import java.util.Scanner;

public class Asg1 {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user for each side individually
        System.out.print("Enter side 1 of the triangle: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side 2 of the triangle: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side 3 of the triangle: ");
        double side3 = input.nextDouble();

        // Prompt the user to enter a color
        System.out.print("Enter a color: ");
        String color = input.next();

        // Read user input for filled option (case-insensitive)
        String filledString;
        do {
            System.out.print("Is the triangle filled (true / false / T / F)? ");
            filledString = input.next().toUpperCase(); // Convert to uppercase for comparison
        } while (!filledString.equals("TRUE") && !filledString.equals("FALSE")
                && !filledString.equals("T") && !filledString.equals("F"));

        // Convert filledString to boolean
        boolean filled = filledString.equals("TRUE") || filledString.equals("T");

        // Create triangle object with user input
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Triangle is " + (triangle.isFilled() ? "" : " not ")
                + "filled");
    }
}
