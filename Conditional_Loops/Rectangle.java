package Conditional_Loops;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Width: ");
        int width = n.nextInt();
        System.out.print("Enter Height: ");
        int height = n.nextInt();

        double area = (width * height);

        System.out.println("Area of Rectangle is: " + area);
    }
}
