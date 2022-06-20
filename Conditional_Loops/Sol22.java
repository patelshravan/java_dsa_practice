package Conditional_Loops;

import java.util.Scanner;

public class Sol22 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int num = n.nextInt();
        int product = 1;
        int sum = 0;

        while (num > 0) {
            product = product *= num % 10;
            sum = sum += num % 10;
            num /= 10;
        }
        System.out.println("The Subtraction is: " + (product - sum));

    }
}
