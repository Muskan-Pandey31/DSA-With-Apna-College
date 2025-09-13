package functions;

import java.util.Scanner;

public class SwapNumbers {
    public void swap(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" a is equals to " + a);
        System.out.println(" b is equals to " + b);

    }

    public static void main(String[] args) {
        SwapNumbers sn = new SwapNumbers();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter value of a: ");
        int a = sc.nextInt();

        System.out.println(" Enter value of b: ");
        int b = sc.nextInt();
        sn.swap(a, b);

    }
}
