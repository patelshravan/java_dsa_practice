package Assignments;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = n.nextInt();

        int i;
        for (i = 1; i <= 10; i++) {
            int res = num * i;
            System.out.println(num + " * " + i + " = "
                    + res);
        }
    }
}
