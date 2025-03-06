package baitap;

import java.util.Scanner;

public class Tinhchuvi {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println(" ban kinh r: ");
        double r = scanner.nextDouble();

        double c = 2 * Math.PI * r;

        double a = Math.PI * Math.pow(r, 2);

        System.out.println("chu vi C: " + c);
        System.out.println("dien tich A: " + a);
    }
}
