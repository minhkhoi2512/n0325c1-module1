package ss5_loot;

import java.util.Scanner;

public class Chuyensonguyenduongthanhnhiph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so nguyen duong n: ");
        int n = scanner.nextInt();

        String binary = " ";
        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }
        System.out.print("so nhi phan tuong ung la: " + binary);
    }
}
