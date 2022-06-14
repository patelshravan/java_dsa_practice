package FirstJava;

import java.util.Scanner;

public class largestNum {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = n.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = n.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " Is a Largest Number");
        } else {
            System.out.println(num2 + " Is a Largest Number");
        }
    }
}
