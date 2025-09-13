package numbers;

import java.util.Scanner;

public class IncomeTaxCalculatorAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if (income < 500000){
            tax = 0;

        } else if (income >= 500000 && income <= 1000000){
            tax = (int)(income * 20 / 100);

        } else {
            tax = (int) (income * 30 / 100);

        }
        System.out.println(" Employee's income tax is: " + tax);

    }
}
