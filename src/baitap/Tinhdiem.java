package baitap;

import java.util.Scanner;

public class Tinhdiem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("diem toan: ");
        double diemToan = scanner.nextDouble();

        System.out.print("he so toan: ");
        int hsToan = scanner.nextInt();

        System.out.print("diem ly: ");
        double diemLy = scanner.nextDouble();

        System.out.print("he so ly: ");
        int hsLy = scanner.nextInt();

        System.out.print("diem hoa: ");
        double diemHoa = scanner.nextDouble();

        System.out.print("he so hoa: ");
        int hsHoa = scanner.nextInt();

        double diemTB = (diemToan * hsToan + diemLy * hsLy + diemHoa * hsHoa) / (hsToan + hsLy + hsHoa);

        System.out.println(" diem TB: " + diemTB);
    }
}
