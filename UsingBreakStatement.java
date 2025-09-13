package numbers;

import java.util.Scanner;

public class UsingBreakStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int limit = sc.nextInt();
        for (int i = 0; i <= n; i++){
            System.out.println(i);
            if (i == limit){
                break;
            }
        }

        System.out.println("I'm out of the loop");
    }
}
