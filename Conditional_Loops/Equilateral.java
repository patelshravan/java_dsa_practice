package Conditional_Loops;

import java.util.Scanner;

public class Equilateral {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Side: ");
        int a = n.nextInt();

        double area = (1.73 * a * a) / 4;

        System.out.println("Area of Equilateral Triangle is: " + area);
    }
}
