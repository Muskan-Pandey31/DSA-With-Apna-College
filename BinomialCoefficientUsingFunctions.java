package functions;

import java.util.Scanner;

public class BinomialCoefficientUsingFunctions {

    public static int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static int coefficientFactorial(int n, int r){
        int nfact = factorial(n);
        int rFact = factorial(r);
        int subFact = factorial(n - r);
        int coefFact = nfact / (rFact * subFact);
        return coefFact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Coefficient factorial of " + n + " and " + r + " is " + coefficientFactorial(n, r));
    }

}
