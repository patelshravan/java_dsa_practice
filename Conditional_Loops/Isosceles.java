package Conditional_Loops;

import java.util.Scanner;

/**
 * Isosceles
 */
public class Isosceles {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base = n.nextInt();
        System.out.print("Enter Height: ");
        int height = n.nextInt();

        double area = (1 * base * height) / 2;

        System.out.println("Area of Isosceles Triangle is: " + area);
    }
}