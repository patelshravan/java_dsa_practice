package FirstJava;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = s.nextLine();

        System.out.println("Hello " + name + " Nice to meet you!");
    }
}
