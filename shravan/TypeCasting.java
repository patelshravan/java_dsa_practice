package shravan;

import java.util.Scanner;

/**
 * TypeCasting
 */
public class TypeCasting {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        float num = n.nextFloat();
        System.out.println("Float " + num);

        // TypeCasting
        int num2 = (int) (737.383f);
        System.out.println("Int " + num2);

        // int count = 0;
        // while (count != 6) {
        // System.out.println(count);
        // count++;
        // }
        // System.out.println("End");

        // int count;
        // for (count = 0; count <= 6; count++) {
        // System.out.println(count);
        // }
    }
}