package ss5_loot;

import java.util.Scanner;

public class Daysochandenlechen3so {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("so nguyênn n: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i += 2)
            if (i % 6 == 0) {
                System.out.print(-i + " ");
            }else {
                System.out.print(i + " ");
            }
    }
}
