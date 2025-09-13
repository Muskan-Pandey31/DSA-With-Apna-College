package functions;

import java.util.Scanner;

public class RangeOfPrimeNumber {
    public static void isPrime(int num){
        for (int i = 1; i <= num; i++){
            int count = 0;

            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    count++;

                }
            }

            if (count == 2){
                System.out.println("It's a prime no: " + i);

            } else {
                System.out.println("It's not prime no: " + i);

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);
    }
}
