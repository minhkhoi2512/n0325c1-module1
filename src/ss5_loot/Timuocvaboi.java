package ss5_loot;

import java.util.Scanner;

public class Timuocvaboi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("so nguyen duong a:");
        int a = scanner.nextInt();
        System.out.print("so nguyen duong b:");
        int b = scanner.nextInt();

        int uscln = 1;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                uscln = 1;
                break;
            }
        }
        int bscnn;
        for (int i = a; true; i++) {
            if (a % i == 0 && b % i == 0) {
                bscnn = i;
                break;
            }
        }
        System.out.print("uoc chung lon nhat cua: " + a + "va: " + b + "la: " + uscln);
        System.out.print("boi chung nho nhat cua: " + a + "va: " + b + "la: " + bscnn);

    }
}
