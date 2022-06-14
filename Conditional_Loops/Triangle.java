package Conditional_Loops;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = n.nextInt();
        System.out.print("Enter height: ");
        int height = n.nextInt();

        double area = (base * height) / 2;

        System.out.println("Area of Triangle is: " + area);
    }
}
