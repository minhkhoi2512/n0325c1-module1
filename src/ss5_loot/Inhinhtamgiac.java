package ss5_loot;

import java.util.Scanner;

public class Inhinhtamgiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("chieu dai canh: ");
        int chieuDaicanh = scanner.nextInt();

        System.out.println("hinh a: ");
        for (int i = 1; i <= chieuDaicanh; i++) {
            for (int j = 1; j <= chieuDaicanh; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("hinh b");
        for (int i = 1; i <= chieuDaicanh; i++) {
            for (int j = 1; j <= chieuDaicanh; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("hinh c");
        for (int i = 1; i <= chieuDaicanh; i++) {
            for (int j =1; j <= chieuDaicanh - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("hinh d: ");
        for (int i = 1; i <= chieuDaicanh; i++) {
            for (int j = 1; j < i; j++) {
        }
            System.out.print(" ");

        for (int j = 1; j <= chieuDaicanh - i + 1; j++) {
            System.out.print("*");
        }
            System.out.println();
        }
        System.out.println("hinh c:");
        for (int i = 1; i <= chieuDaicanh; i++) {
            for (int j = 1; j <= chieuDaicanh - i + 1; j ++) {
                if (i == 1 || j == 1 || j == chieuDaicanh - i + 1) {
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("hinh f: ");
        for (int i = 1; i <= chieuDaicanh; i++) {
            for (int j = 1; j <= chieuDaicanh - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("hinh g: ");
        for (int i = 1; i <= chieuDaicanh; i++) {
            for (int j = 1; j < 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (chieuDaicanh - i) * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
