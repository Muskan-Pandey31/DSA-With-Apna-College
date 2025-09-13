package numbers;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int table = 1;
        System.out.println("****** Multiplication Table ******");

        for (int i = 1; i <= 10; i++){
            table = n * i;
            System.out.println(table);

        }

    }
}
