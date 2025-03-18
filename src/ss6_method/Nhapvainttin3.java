package ss6_method;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Nhapvainttin3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<HashMap<String, String>> danhSachNhanVien = new ArrayList<>();
        String tiepTuc;

        do {
            System.out.println("Nhập thông tin nhân viên:");

            System.out.print("Tên: ");
            String ten = scanner.nextLine();

            System.out.print("Tuổi: ");
            String tuoi = scanner.nextLine();

            System.out.print("Chức vụ: ");
            String chucVu = scanner.nextLine();

            HashMap<String, String> nhanVien = new HashMap<>();
            nhanVien.put("Ten", ten);
            nhanVien.put("Tuoi", tuoi);
            nhanVien.put("ChucVu", chucVu);

            danhSachNhanVien.add(nhanVien);

            System.out.print("Bạn có muốn tiếp tục nhập thông tin nhân viên (y/n)? ");
            tiepTuc = scanner.nextLine();

        } while (tiepTuc.equalsIgnoreCase("y"));

        inThongTinNhanVien(danhSachNhanVien);
        scanner.close();
    }

    public static void inThongTinNhanVien(ArrayList<HashMap<String, String>> danhSachNhanVien) {
        System.out.println("\nThông tin nhân viên:");
        for (HashMap<String, String> nhanVien : danhSachNhanVien) {
            System.out.println("Tên: " + nhanVien.get("Ten"));
            System.out.println("Tuổi: " + nhanVien.get("Tuoi"));
            System.out.println("Chức vụ: " + nhanVien.get("ChucVu"));
            System.out.println(" ");
        }
    }
}
