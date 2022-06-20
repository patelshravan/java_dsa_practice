package Conditional_Loops;

import java.util.Scanner;

public class PerimeterRhombus {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Side Of a Rhombus: ");
        double area = n.nextDouble();

        double perimeter = 4 * area;

        System.out.println("Perimeter Of a Rhombus is: " + perimeter);
    }
}
