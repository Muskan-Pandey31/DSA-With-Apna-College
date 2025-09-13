package numbers;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        while (n > 0){
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
        }

        System.out.println(reverse);

//  We can reverse the no like this from first variable

        n = reverse;
        System.out.println(n);

    }
}
