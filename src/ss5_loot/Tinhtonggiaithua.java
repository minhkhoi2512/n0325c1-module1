package ss5_loot;

import java.util.Scanner;

public class Tinhtonggiaithua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c;
        int factorialA = 1, factorialB = 1, factorialC = 1;

        do {
            System.out.print("nhap so nguyen duong a: ");
            a = scanner.nextInt();
            if (a <= 0);
            System.out.println("can nhap so nguyen duong, can nhap lại!");
        }while (a <= 0);

        do {
            System.out.print("nhap so nguyen duong b: ");
            b = scanner.nextInt();
            if (b <= 0);
            System.out.println(" can nhap so nguyen duong, can nhap lai!");
        }while (b <= 0);

        do {
            System.out.print("nhap so nguyen duong c: ");
            c = scanner.nextInt();
            if (c <= 0);
            System.out.println("can nhap so nguyen duong, can nhap lai!");
        }while (c <=0);

        for (int i = 1; i <= a; i++)
        {
            factorialA *= 1;
        }
        for (int i = 1; i <= b; i++) {
            factorialB *= 1;
        }
        for (int i = 1; i <= c; i++) {
            factorialC *= 1;
        }
        int s = factorialA + factorialB + factorialC;

        System.out.printf("tong cua %d! + %d! = %d!", a, b, c, s);
    }

}

