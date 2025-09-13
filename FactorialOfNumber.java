package functions;

import java.util.Scanner;

public class FactorialOfNumber {
    public int factorial(int n){
        int factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        FactorialOfNumber f = new FactorialOfNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(" Factorial of " + n + " is: " + f.factorial(n));
    }
}
