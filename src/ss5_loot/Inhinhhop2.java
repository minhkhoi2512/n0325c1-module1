package ss5_loot;

import java.util.Scanner;

public class Inhinhhop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("chieu dai canh cua hinh vuong: ");
        int chieuDaicanh = scanner.nextInt();

        System.out.println("hinh a: ");
        for (int i = 1; i <= chieuDaicanh; i++){
            for (int j = 1; j <= chieuDaicanh; j++) {
                if (i == 1 || i == chieuDaicanh || j == 1 || j == chieuDaicanh) {
                    System.out.print("* ");
                }else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
        System.out.println("hinh b: ");
        for (int i = 1; i <= chieuDaicanh; i++){
            for(int j = 1; j <= chieuDaicanh; j++) {
                if (i == 1 || i == chieuDaicanh || j == 1 || j == chieuDaicanh) {
                    System.out.print("* ");
                }else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
        System.out.println("hinh c: ");
        for (int i = 1; i <= chieuDaicanh; i++) {
            for (int j = 1; j <= chieuDaicanh; j++) {
                if (i == 1 || i == chieuDaicanh || j == 1 || j == chieuDaicanh) {
                    System.out.print("* ");
                }else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}

