package Assignments;

import java.util.Scanner;

public class HCF {
    static int hcf(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return hcf(num2, num1 % num2);
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter Two Digits");
        int num1 = n.nextInt();
        int num2 = n.nextInt();
        System.out.println("HCF Of " + num1 + " and " + num2 + " is " + hcf(num1, num2));
    }

}
