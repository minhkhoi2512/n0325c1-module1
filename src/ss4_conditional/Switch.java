package ss4_conditional;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nhap tu 1 tới 10: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("chủ nhật");
            case 2 -> System.out.println("thứ 2");
            case 3 -> System.out.println("thứ 3");
            default -> System.out.println(" nhập sai giá trị");
        }
    }
}
