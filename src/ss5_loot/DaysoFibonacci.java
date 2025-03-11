package ss5_loot;

import java.util.Scanner;

public class DaysoFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print(" nhap so nguyen n: ");
        int n = scanner.nextInt();

        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        while (fn <= n) {
            System.out.print(fn + "\t");

            f1 = f2;
            f2 = fn;

            fn = f1 + f2;
        }
    }
}