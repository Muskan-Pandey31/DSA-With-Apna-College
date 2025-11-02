package functions;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int binaryToDecimal(int num) {
        int pow = 0;
        int dec = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            dec = dec + (lastDigit * (int) (Math.pow(2, pow)));
            pow++;
            num = num / 10;

        }

        return dec;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The decimal number of " + num + " binary number is " + binaryToDecimal(num));

    }
}
