package Conditional_Loops;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base = n.nextInt();
        System.out.print("Enter Height: ");
        int height = n.nextInt();

        double area = (base * height);

        System.out.println("Area of Parallelogram is: " + area);
    }
}
