package numbers;

import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b){
            System.out.println(" a is greatest: " + a);

        } else {
            System.out.println(" b is greatest: " + b);

        }
    }
}
