package Conditional_Loops;

import java.util.Scanner;

public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Side Of a Square: ");
        double area = n.nextDouble();

        double perimeter = 4 * area;

        System.out.println("Perimeter Of a Square is: " + perimeter);
    }
}
