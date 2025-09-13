package numbers;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = (a % 2 == 0) ? "even" : "odd";
        System.out.println(s);
    }
}
