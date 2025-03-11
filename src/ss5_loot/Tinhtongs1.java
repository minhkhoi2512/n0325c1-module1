package ss5_loot;

import java.util.Scanner;

public class Tinhtongs1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("so nguyen duong n: ");
        int n = scanner.nextInt();

        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("tổng S: " + sum);
    }
}
