package numbers;

import java.util.Scanner;

public class AddEvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int choice;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        do {
            System.out.println("Enter your no:");
            n = sc.nextInt();
            if (n % 2 == 0) {
                sumOfEvenNumbers += n;

            } else {
                sumOfOddNumbers += n;

            }

            System.out.println(" Do you want to continue? Press 1 for yes or 0 for no: ");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println(" Total sum of even no: " + sumOfEvenNumbers);
        System.out.println(" Total sum of odd no: " + sumOfOddNumbers);

    }
}
