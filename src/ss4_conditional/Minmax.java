package ss4_conditional;
/*min va max của 2 giá trj */

public class Minmax {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
     int max;
     if (a > b) {
         max = a;
     } else {
         max = b;
     }
     int max2 = a > b ? a : b;
     int min = a < b ? a : b;
     int min2 = Math.min(a, b);
    }
}
