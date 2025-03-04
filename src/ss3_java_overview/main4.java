package ss3_java_overview;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao ten cua ban: ");
        String name = scanner.nextLine();
//  scanner.nextLine(); => xoa dau enter //
        System.out.println("Nhap vào tuoi cua ban: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Ten cua ban la: " + name);
        System.out.println("Tuoi cua ban la:" + age);
    }
}
