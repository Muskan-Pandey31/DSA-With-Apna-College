package numbers;

import java.util.Scanner;

public class CheckingStudentResultUsingTernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String result = (marks >= 33) ? "Pass" : "Fail";
        System.out.println(" Student is: " + result);
    }
}
