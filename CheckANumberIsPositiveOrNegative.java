package numbers;

import java.util.Scanner;

public class CheckANumberIsPositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0){
            System.out.println(" a holds a positive number: " + a);

        } else if (a < 0){
            System.out.println(" a holds a negative number: " + a);

        } else {
            System.out.println(" a holds zero: " + a);

        }
    }
}
