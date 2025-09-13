package functions;

import java.util.Scanner;

public class CheckPrimeByApnaCollege {
    public static boolean isPrime(int n){
        boolean isPrime = true;



        for (int i = 2; i <= n - 1; i++){
            if (n % i == 0){
//                isPrime = false;
                System.out.println("break " + i);
//                break;
//                continue;
                return false;
            }
            System.out.println("break1 " + i);
        }

//        return isPrime;
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + " is a prime number: " + isPrime(n));

    }
}
