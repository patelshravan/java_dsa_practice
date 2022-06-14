package Assignments;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int Year = n.nextInt();

        if ((Year % 400 == 0) || ((Year % 4 == 0) && (Year % 100 == 0))) {
            System.out.println(Year + " : Is aLeap Year");
        } else {
            System.out.println(Year + " : Not a Leap Year");
        }
    }
}
