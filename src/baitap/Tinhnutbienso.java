package baitap;

import java.util.Scanner;

public class Tinhnutbienso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" bien so xe: ");
        int n = scanner.nextInt();

        int sum = n % 10;
        n = n / 10;

        sum = sum + n % 10;
        n = n / 10;

        sum = sum + n % 10;
        n = n / 10;

        sum = sum + n % 10;
        n = n / 10;

        sum = sum + n;

        int buttonNumber = sum % 10;

        System.out.println("so nut: " + buttonNumber);
    }
}
