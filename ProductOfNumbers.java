package functions;

import java.util.Scanner;

public class ProductOfNumbers {
    public int product(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        ProductOfNumbers p = new ProductOfNumbers();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(" Product of a & b is: " + p.product(a, b));
    }
}
