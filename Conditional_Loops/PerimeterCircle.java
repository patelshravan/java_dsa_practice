package Conditional_Loops;

import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Radius Of a Circle: ");
        double radius = n.nextDouble();

        double perimeter = Math.PI * 2 * radius;

        System.out.println("Perimeter Of a Circle is: " + perimeter);

    }
}
