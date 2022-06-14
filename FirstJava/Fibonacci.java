package FirstJava;

import java.util.Scanner;

/**
 * Fibonacci
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = n.nextInt();
        int n1 = 0, n2 = 1, n3, i;

        for (i = 2; i <= num; ++i) {
            n3 = n1 + n2;
            System.out.println(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}