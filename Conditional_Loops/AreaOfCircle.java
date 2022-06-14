package Conditional_Loops;

import java.util.Scanner;

/**
 * AreaOfCircle
 */
public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        int radius = n.nextInt();
        double area;
        area = (radius * radius) * Math.PI;
        System.out.println("Area od circle is: " + area);

    }
}