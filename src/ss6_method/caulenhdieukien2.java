package ss6_method;

import java.util.Scanner;

public class caulenhdieukien2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap he so a: ");
        double a = scanner.nextDouble();

        System.out.print("nhap he so b: ");
        double b = scanner.nextDouble();

        System.out.println("ket qua phuong trinh bac nhat");

        levelOne(a, b);


    }

    public static void levelOne(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh co vo so nghiem.");
            }else {
                System.out.println("ohuong trinh vo nghiem.");
            }
        }else {
            double x = -b / a;
            System.out.println("nghiem cua phuong trinh la x=" + x);
        }
    }
}
