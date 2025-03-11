package ss5_loot;

import java.util.Scanner;

public class Indayso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" số nguyên n ");
        int n = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.println(i + "\t");
        }
    }
}
