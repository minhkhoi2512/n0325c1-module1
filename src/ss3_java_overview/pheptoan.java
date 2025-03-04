package ss3_java_overview;

import java.util.Scanner;

public class pheptoan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System .in);



        System.out.print("nhap so a: ");
        int a = scanner.nextInt();

        System.out.println("nhap so b: ");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double quatient = (double) a / b;

        System.out.println("tổng:" + sum);
        System.out.println("hiệu: " + difference);
        System.out.println("tích: " + product);
        System.out.println("thương: " + quatient);

    }
}


