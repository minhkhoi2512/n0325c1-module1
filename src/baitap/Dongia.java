package baitap;

import java.util.Scanner;

public class Dongia {
    public static void main( String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("sach: ");
        String tenSanPham = scanner.nextLine();

        System.out.println("so luong: ");
        int soLuong = scanner.nextInt();

        System.out.println("don gia: ");
        double donGia = scanner.nextDouble();

        double tien = soLuong * donGia;

        double thueGTGT = 0.1 * tien;

        System.out.println("sach: " + tenSanPham);
        System.out.println("don gia " + tien);
        System.out.println("thue GTGT: " +thueGTGT);
    }
}
