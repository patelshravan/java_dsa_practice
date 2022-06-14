package FirstJava;

import java.util.Scanner;

public class SimpleInt {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        float p = n.nextFloat();
        System.out.print("Enter Time: ");
        float t = n.nextFloat();
        System.out.print("Enter Rate: ");
        float r = n.nextFloat();

        float si = (p * t * r) / 100;

        System.out.println("Simple Interest of " + p + " " + t + " " + r + " is: " + si);
    }
}
