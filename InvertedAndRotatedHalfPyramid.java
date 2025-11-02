package patterns;

import java.util.Scanner;

public class InvertedAndRotatedHalfPyramid {
    public static void invertedRotatedHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }

            for (int k = 1; k <= i; k++) {
                System.out.print("*");

            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        invertedRotatedHalfPyramid(n);

    }
}
