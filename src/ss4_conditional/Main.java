package ss4_conditional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so tu nhien 1 den 10: ");
        int number = scanner.nextInt();
        String englishNumber;
        if (number == 1){
            englishNumber = "one";
        }else if (number == 2){
            englishNumber = "two";
        }else if (number == 3){
            englishNumber = "three";
        }else if (number == 4){
            englishNumber = "four";
        }else if (number == 5){
            englishNumber = "five";
        }else if (number == 6){
            englishNumber = "six";
        }else if (number == 7){
            englishNumber = "seven";
        }else if (number == 8){
            englishNumber = "eight";
        }else if (number == 9){
            englishNumber = "nine";
        }else if (number == 10){
            englishNumber = "ten";
        }else{
            System.out.println("nhap lai gia trị từ 1 toi 10: ");
        }
    }
}
