package functions;

import java.util.Scanner;

public class CheckPalindrome {
    public static boolean checkPalindrome(int n) {
        int originalNumber = n;
        int reversedNumber = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            n = n / 10;
        }
        if (originalNumber == reversedNumber) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPalindrome(n));

    }
}
