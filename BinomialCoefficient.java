package numbers;

import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int sub = n - r;
        int nFact = 1;
        int rFact = 1;
        int subFact = 1;

        for (int i = 1; i <= n; i++){
            nFact *= i;

        }

        for (int i = 1; i<= r; i++){
            rFact *= i;

        }

        for (int i = 1; i <= sub; i++){
            subFact *= i;

        }

        int binomialCoefficient = nFact / (rFact * subFact);
        System.out.println(binomialCoefficient);

    }
}
