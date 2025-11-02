package functions;

import java.util.Scanner;

public class SumOfANumber {
    public static int sumOfNumber(int num){
        int sum = 0;
        while(num > 0){
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;

        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Sum of every digit of " + num + " is " + sumOfNumber(num));

    }
}
