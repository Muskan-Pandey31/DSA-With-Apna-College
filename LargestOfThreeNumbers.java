package numbers;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
                System.out.println(" a is greatest: " + a);

        } else if (b > c && b > a){
                System.out.println(" b is greatest: " + b);

        } else if(c > a && c > b) {
            System.out.println(" c is greatest: " + c);

        } else {
            System.out.println("Invalid inputs");

        }
    }
}
