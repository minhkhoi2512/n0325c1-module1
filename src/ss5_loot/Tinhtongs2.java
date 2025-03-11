package ss5_loot;

import java.util.Scanner;

public class Tinhtongs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" so nguyen duong n: ");
        int n = scanner.nextInt();

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            int fact = 1;
            for (int j = 1; j <= (2 - 1); j++) {
                fact *= j;
            }
            sum += 1.0 / fact;
        }
        System.out.println("tong S: " + sum);
    }
}
