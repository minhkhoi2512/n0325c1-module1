package ss5_loot;

import java.util.Scanner;

public class Tinhtonggiaithua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        int factorialA = 1, factorialB = 1, factorialC = 1;

        do {
            System.out.print("so nguyen duong a: ");
            a = scanner.nextInt();

            if (a <= 0) {
                System.out.println("can nhap so nguyen duong, xin nhap lai!");
            }
            while (a <= 0);

            do {
                System.out.print("so nguyen duong b: ");
                b = scanner.nextInt();
                if (b <= 0) {
                    System.out.println("can nhap so nguyen duong, xin nhap lai!");
                }
                while (b <= 0);
        }
    }
}
