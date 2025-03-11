package ss5_loot;

import java.util.Scanner;

public class Indayso4 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("so nguyen n:");
        int n = scaner.nextInt();

        int a = 1;
        int b = 1;

        while (a <= n) {
            System.out.println(a * b + " ");

            a = a * 2 + 1;

            b = -b;
        }
    }
}
