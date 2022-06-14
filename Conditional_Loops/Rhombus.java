package Conditional_Loops;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter 1st Diagonal: ");
        int d1 = n.nextInt();
        System.out.print("Enter 2nd Diagonal: ");
        int d2 = n.nextInt();

        double area = (d1 * d2) / 2;

        System.out.println("Area of Rhombus is: " + area);
    }
}
