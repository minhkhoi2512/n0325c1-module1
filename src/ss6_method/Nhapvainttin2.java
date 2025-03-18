package ss6_method;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Nhapvainttin2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng nhân viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line sau khi nhập số

        ArrayList<HashMap<String, String>> danhSachNhanVien = nhapThongTinNhanVien(n, scanner);
        inThongTinNhanVien(danhSachNhanVien);

        scanner.close();
    }

    public static ArrayList<HashMap<String, String>> nhapThongTinNhanVien(int n, Scanner scanner) {
        ArrayList<HashMap<String, String>> danhSachNhanVien = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");

            System.out.print("Tên: ");
            String ten = scanner.nextLine();

            System.out.print("Tuổi: ");
            String tuoi = scanner.nextLine(); // Đọc tuổi như String để tránh lỗi nhập

            System.out.print("Chức vụ: ");
            String chucVu = scanner.nextLine();

            HashMap<String, String> nhanVien = new HashMap<>();
            nhanVien.put("Ten", ten);
            nhanVien.put("Tuoi", tuoi);
            nhanVien.put("ChucVu", chucVu);

            danhSachNhanVien.add(nhanVien);
        }

        return danhSachNhanVien;
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
