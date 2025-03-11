package ss5_loot;

import java.util.Scanner;

public class Indayso3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap so nguyen: ");
        int n = scanner.nextInt();

        int a = 1;

        while (a <= n) {
            System.out.print(a + " ");

            a = 2 * a + 1;
        }

    }
}
