package ss5_loot;

import java.util.Scanner;

public class Tongcacsodoixung {
    private static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so nguyen duong a: ");
        int a = scanner.nextInt();

        System.out.println("nhap so nguyen duong b: ");
        int b = scanner.nextInt();

        int soluongSoDoiXung = 0;
        int tongSoDoiXung = 0;

        int soluongSoChinhPhuong = 0;
        int tongSoChinhPhuong = 0;

        int soluongSoNguyenTo = 0;
        int tongSoNguyenTo = 0;

        boolean isPrime = false;
        for (int n = a; n <= b; n++) {
            String str = Integer.toString(n);
            boolean isPalindrone = true;
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    isPalindrone = false;
                    break;
                }
            }
            if (isPalindrone) {
                soluongSoDoiXung++;
                tongSoDoiXung += n;
            }
            if (Math.sqrt(n) % 1 == 0) {
                soluongSoChinhPhuong++;
                tongSoChinhPhuong += n;
            }

            isPrime = true;
            if (n < 2) {
                isPrime = false;
            }
            for (int i = 2; i < Math.sqrt(n); i++)
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
        }
        if (isPrime) {
            soluongSoNguyenTo++;
            tongSoNguyenTo += n;
        }
        System.out.printf("so doi xung trong doan [%d, %d]: %d\n", a, b, soluongSoDoiXung);
        System.out.printf("tong so doi xung trong doan [%d, %d]: %d\n", a, b, tongSoDoiXung);
        System.out.printf("so chinh phuong trong doan [%d, %d]: %d\n", a, b, soluongSoChinhPhuong);
        System.out.printf("tống chinh phuong trong doan [%d, %d]: %d\n", a, b, tongSoChinhPhuong);
        System.out.printf("so luong so nguyen to trong doan [%d, %d]: %d\n", a, b, soluongSoNguyenTo);
        System.out.printf("tong so luong so nguyen to trong doan [%d.%d]: %d\n", a, b, tongSoNguyenTo);

    }
}

