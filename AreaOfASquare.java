package numbers;

import java.util.Scanner;

public class AreaOfASquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side * side;
        System.out.println(" Area of a square: " + area);
    }
}
