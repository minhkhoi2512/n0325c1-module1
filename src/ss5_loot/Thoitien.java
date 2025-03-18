package ss5_loot;

import java.util.Scanner;

public class Thoitien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("gia cua mon do: ");
        int giaMondo = scanner.nextInt();

        System.out.println("so tien khach tra: ");
        int tienKhachtra = scanner.nextInt();

        int tienThoikhach = tienKhachtra - giaMondo;
        int menhGiatien;

        for (int i = 2; i >= 0 ; i--) {
          int heso = (int) Math.pow(10, i);

          menhGiatien = 5000 * heso;
          if (tienThoikhach >= menhGiatien) {
              System.out.printf("%d tờ %d\n", tienThoikhach / menhGiatien, menhGiatien);
              tienThoikhach %= menhGiatien;
          }
          menhGiatien = 1000 * heso;
          if (tienThoikhach >= menhGiatien) {
              System.out.printf("%d tờ %d\n", tienThoikhach / menhGiatien, menhGiatien);
              tienThoikhach %= menhGiatien;
          }
        }
        System.out.println("so tiền còn lại: " + tienThoikhach);
    }
}
