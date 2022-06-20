package Conditional_Loops;

import java.util.Scanner;

public class PerimeterRactangle {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Length Of a Rectangle: ");
        double length = n.nextDouble();
        System.out.print("Enter Breadth Of a Rectangle: ");
        double breadth = n.nextDouble();

        double perimeter = 2 * (length + breadth);

        System.out.println("Perimeter Of a Rectangle is: " + perimeter);
    }
}
