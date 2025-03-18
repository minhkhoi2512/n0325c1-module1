package ss6_method;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Timuocchung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao so nguyen a: ");
        int a = scanner.nextInt();
        System.out.print("nhap vao so nguyen b: ");
        int b = scanner.nextInt();

        System.out.printf("uoc so chung cua 2 so %d và %d la: %d",a, b, uscln(a, b));
    }
        static int uscln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        if (max % min == 0) {
            return min;
        }
        for (int i = min / 2; i>= 1; i--){
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
        }
}
