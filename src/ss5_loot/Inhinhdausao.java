package ss5_loot;

import java.util.Scanner;

public class Inhinhdausao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("chieu dai canh: ");
        int chieuDaicanh = scanner.nextInt();

        System.out.println("hinh a: ");
        for (int i = 1; i <= chieuDaicanh; i++) {
            for(int j = 1; j <= chieuDaicanh; j++) {
                if (i == 1 || j == chieuDaicanh || j == 1) {
                    System.out.print("*");
                }else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
        for ( int i = 1; i <= chieuDaicanh; i++){
            for (int j = 1; j <= chieuDaicanh; j++){
                if (i == 1 || i == chieuDaicanh || j == chieuDaicanh - i + 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
