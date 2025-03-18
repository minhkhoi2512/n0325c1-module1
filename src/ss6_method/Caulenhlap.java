package ss6_method;

import java.util.Scanner;

public class Caulenhlap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap vao so nguyen duong n: ");
        int n = scanner.nextInt();
        if (isPrimeNumber(n)) {
            System.out.print("la so nguyen to");
        }else {
            System.out.println("khong phai so nguyen to");
        }
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int calTotalPrime(int n) {
        int total = 0;
        while (n != 0) {
            if (isPrimeNumber(n % 10)) {
                total += n % 10;
            }
            n /= 10;
        }

        return total;
    }
}

