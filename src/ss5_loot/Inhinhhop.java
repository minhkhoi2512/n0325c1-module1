package ss5_loot;

import java.util.Scanner;

public class Inhinhhop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("chieu dai canh cua hinh vuong: ");
        int chieudaicanh = scanner.nextInt();

        for (int i = 1; i <= chieudaicanh; i++){
            for (int j = 1; j <= chieudaicanh; j++){
                if (i == 1 || i == chieudaicanh || j == 1 || j == chieudaicanh){
                    System.out.print("* ");
                }else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
}
