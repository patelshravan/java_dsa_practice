package shravan;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius: ");
        float num = n.nextFloat();

        float temp = (float) ((num * 9 / 5) + 32);

        System.out.println("Temperature in Fahrenheit: " + temp + "F");
    }
}
