package Assignments;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Two Digits: ");
        int num1 = n.nextInt();
        int num2 = n.nextInt();
        int lcm = (num1 > num2) ? num1 : num2;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.print("The LCM Of " + num1 + " and " + num2 + " is : " + lcm);
                break;
            }
            ++lcm;
        }
    }
}
