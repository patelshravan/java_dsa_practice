package Conditional_Loops;

import java.util.Scanner;

public class PerimeterParallelogram {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Height Of a Parallelogram: ");
        double height = n.nextDouble();
        System.out.print("Enter Breadth Of a Parallelogram: ");
        double breadth = n.nextDouble();

        double perimeter = 2 * (height + breadth);

        System.out.println("Perimeter Of a Parallelogram is: " + perimeter);
    }
}
