package Conditional_Loops;

import java.util.Scanner;

public class PerimeterEquiTriangle {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Area Of a Equilateral Triangle: ");
        double area = n.nextDouble();

        double perimeter = 3 * area;

        System.out.println("Perimeter Of a Circle is: " + perimeter);

    }
}
