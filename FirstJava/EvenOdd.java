package FirstJava;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = n.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " Is Even Number");
        } else {
            System.out.println(num + " Is Odd Number");
        }
    }
}
