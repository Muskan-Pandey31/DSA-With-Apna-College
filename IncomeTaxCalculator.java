package numbers;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if (income < 500000){
            System.out.println(" Employee's income tax is: 0 ");

        } else if (income >= 500000 && income <= 1000000){
            System.out.println(" Employee's income tax is: " + (income * 20 / 100));

        } else {
            System.out.println(" Employee's income tax is: " + (income * 30 / 100));

        }
    }
}
