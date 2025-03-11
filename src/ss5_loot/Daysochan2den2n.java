package ss5_loot;

import java.util.Scanner;

public class Daysochan2den2n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" tu 2 den 2n: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
