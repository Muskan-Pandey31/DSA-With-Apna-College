package numbers;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            count += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        int average = count / n;
        System.out.println(average);
    }
}
