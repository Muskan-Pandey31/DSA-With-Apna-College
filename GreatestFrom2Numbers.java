package numbers;

import java.util.Scanner;

public class GreatestFrom2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b){
            System.out.println(" a is greater: " + a);

        } else {
            System.out.println(" b is greater: " + b);
        }
    }
}
