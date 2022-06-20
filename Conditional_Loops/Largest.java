package Conditional_Loops;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int sum = 0;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter the number: ");
            int num = n.nextInt();
            if (num == 0) {
                System.out.println("Program Over!");
                break;
            } else {
                if (num > max) {
                    max = num;
                }
                sum = max;
                System.out.println("The Largest numbers is " + sum);
            }
        }

    }
}
