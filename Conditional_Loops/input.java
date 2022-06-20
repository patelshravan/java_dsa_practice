package Conditional_Loops;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter the number: ");
            int num = n.nextInt();
            if (num == 0) {
                System.out.println("Program Over!");
                break;
            } else {
                sum = sum + num;
                num = num + 1;
                System.out.println("The sum of the numbers is " + sum);
            }
        }

    }
}
