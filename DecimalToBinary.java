package functions;

import java.util.Scanner;

public class DecimalToBinary {
    public static int decimalToBinary(int num){
        int pow = 0;
        int binary = 0;
        while (num > 0){
            int lastDigit = num % 2;
            binary = binary + (lastDigit * (int)Math.pow(10, pow));
            pow++;
            num = num / 2;
        }

        return binary;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The binary number of " + num + " decimal number is " + decimalToBinary(num));

    }
}
