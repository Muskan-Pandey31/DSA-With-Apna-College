package functions;

import java.util.Scanner;

public class RangeOfPrimeNumberUsingAnotherMethod {
    public static void isPrime(int n) {
        System.out.print("The range of prime numbers up to " + n + " is: ");
        for (int i = 1; i <= n; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;

                }
            }

            if (count == 2) {
                System.out.print(i + ", ");

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);

    }
}
