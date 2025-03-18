package ss6_method;

import java.util.Scanner;

public class caulenhdieukien3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap he so a");
        double a = scanner.nextDouble();

        System.out.print("nhap he so b");
        double b = scanner.nextDouble();

        System.out.print("nhap he so c");
        double c = scanner.nextDouble();

        System.out.println("ket qua cua phuong trinh bac 2");

        levelOne (a, b, c);


    }
    public static void levelOne(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phuong trinh co vo so nghiem");
                }else {
                    System.out.println("[phuong trin vo nghiem");
                }
            }else {
                double x = -c/b;
                System.out.println("nghiem cua phuong trinh x = " + x);
            }
        }else {
            double detal = b * b - 4 * a * c;
            if (detal < 0) {
                System.out.println("phuong trinh vo nghiem");
            }else if (detal == 0) {
               double x = -b / (2 * a);
                System.out.println("nghiem kep cua phuong trinh x = " + x);
            }else {
                double x1 = (-b - Math.sqrt(detal)) / (2 * a);
                double x2 = (-b + Math.sqrt(detal)) / (2 * a);
                System.out.println("nghiem cua x1 = " + x1 + "va x2" + x2);
            }
        }

    }
}
