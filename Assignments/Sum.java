package Assignments;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int res = 0;

        while (true) {
            String num = n.next();
            if (num.equals("x")) {
                break;
            } else {
                int i = Integer.parseInt(num);
                res += i;
                System.out.println(res);
            }
        }
    }
}
