package ss5_loot;

import java.util.Scanner;

public class Indausao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("chieu dai cua canh: ");
        int chieuDaicanh = scanner.nextInt();

        for (int i = 1; i <= chieuDaicanh; i++) {
            for (int j = 1; j <= chieuDaicanh; j++) {
                if (i == 1 || i == chieuDaicanh || j == 1 || j == chieuDaicanh || i == j) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
