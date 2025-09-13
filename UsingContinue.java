package numbers;

import java.util.Scanner;

public class UsingContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int limit = sc.nextInt();
        for (int i = 0; i <= n; i++){

            if (i == limit){
                continue;
            }

            System.out.println(i);

        }
    }
}
