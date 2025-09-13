package functions;

import java.util.Scanner;

public class SwapNumbersUsingThreeVariables {
    public static void swapNumbers(int a, int b){
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int forSwapOnly = a;
        a = b;
        b = forSwapOnly;

        System.out.println("****** After Swaping ******");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swapNumbers(a, b);
    }
}
