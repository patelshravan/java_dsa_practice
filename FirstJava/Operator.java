package FirstJava;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = n.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = n.nextInt();

        System.out.println("Addition of the two number is: " + (num1 + num2));
        System.out.println("Subtraction of the two number is: " + (num1 - num2));
        System.out.println("Multiply of the two number is: " + (num1 * num2));
        System.out.println("Division of the two number is: " + (num1 / num2));

    }
}
