package ss5_loot;

public class Sothoamandieukien {
    public static void main(String[] args) {
        System.out.println("so thoa man dieu kien la: ");
        for (int number = 10; number <= 99; number++) {
            int tenDigit = number / 10;
            int onesDigit = number % 10;

            int sum = tenDigit + onesDigit;
            int product = tenDigit + onesDigit;

            if (product == 2 * sum) {
                System.out.println(number);
            }
        }
    }
}
