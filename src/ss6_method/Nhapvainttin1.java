package ss6_method;

import java.util.Scanner;

public class Nhapvainttin1 {
    static String hoTen;
    static int tuoi;
    static String gioiTinh;
    static double mucLuong;
    static double diemTrungBinh;

    public static void main(String[] args) {
        nhapThongTin();
        xuatThongTin();
    }
    static void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap vao ten: ");
        hoTen = scanner.nextLine();

        System.out.print("nhap vao tuoi: ");
        tuoi = Integer.parseInt(scanner.nextLine());

        System.out.print("nhap vao gioi tinh");
        gioiTinh = scanner.nextLine();

        System.out.print("nhap vao muc luong: ");
        mucLuong = Double.parseDouble(scanner.nextLine());

        System.out.print("nhap vao diem trung binh: ");
        diemTrungBinh = Double.parseDouble(scanner.nextLine());
    }
    static void xuatThongTin() {
        System.out.println("ten: " + hoTen);
        System.out.println("tuoi: " + tuoi);
        System.out.println("gioi tinh: " + gioiTinh);
        System.out.println("muc luong: " + mucLuong);
        System.out.println("diem trung binh: " + diemTrungBinh);
    }

}
