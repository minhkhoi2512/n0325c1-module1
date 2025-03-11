package ss5_loot;

import java.util.Scanner;

public class Tinhtongvatich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" nhap so nguyen m: ");
        int m = scanner.nextInt();

        int s = 0;
        int p = 1;

        while (m > 0) {
            int digit = m % 10;

            s = s + digit;
            p = p * digit;

            m = m/10;
        }
        System.out.println(" tong cac so nguyen: " + s);
        System.out.println(" tong cac so nguyen: " + p);
    }
}
