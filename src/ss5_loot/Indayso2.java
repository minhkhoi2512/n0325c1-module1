package ss5_loot;

import java.util.Scanner;

public class Indayso2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //bước 1
        System.out.print("SO NGUYEN N: ");
        int n = scanner.nextInt();

        // buoc 2
        int count = 0;
        int distance = 1;

        // buoc 3
        for (int i = 2; i <=n; i += 2) {
            if (count == distance){
                System.out.print(-i + " ");
                count = 0;
                distance++;
            }else{
                System.out.print(i + " ");
                count++;
            }
        }

    }
}
