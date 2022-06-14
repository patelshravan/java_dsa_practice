package FirstJava;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Currency in Rupees: ");
        double curr = n.nextDouble();

        double doll = (curr * 78.05);

        System.out.println("Your Currency in USD is: " + doll + " $");
    }
}
