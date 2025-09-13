package functions;

import java.util.Scanner;

public class CheckPrime {
    public static int checkPrime(int num){
        int count = 0;

        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                count++;

            }
        }

        if (count == 2){
            System.out.println("It's a prime no: " + num);

        } else {
            System.out.println("It's not a prime no: " + num);

        }

        return num;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkPrime(num);

    }
}
