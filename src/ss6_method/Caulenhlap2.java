package ss6_method;

import java.util.Scanner;

public class Caulenhlap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap cao so nguyen n: ");
        int n = scanner.nextInt();

        System.out.printf("a . S = 1 + 2 + ... + %d = %d\n", n, calculateSumOfIntergers(n));

        System.out.printf("b. S = 1^2 + 2^2 + ... + %d^2 = %d\n", n, calculateSumOfSquares(n));

        System.out.printf("c. S = 1 + 1/2 + ... + 1/%d = %.2f\n", n, calculateSum(n));

        System.out.printf("d. S = 1 * 2 * ... * %d = %d\n", n, calculateFactorial(n));

        System.out.printf("e. S = 1! + 2! + ... + %d = %d\n", n, calculateFactoriaSum(n));
    }
    static int calculateSumOfIntergers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    static int calculateSumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
    static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
    static long calculateFactorial(long n) {
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
    static long calculateFactoriaSum(long n) {
        long sum = 0;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= 1;
            sum += factorial;
        }
        return factorial;
    }
}