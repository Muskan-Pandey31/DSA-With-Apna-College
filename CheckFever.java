package numbers;

import java.util.Scanner;

public class CheckFever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();
        if (temperature > 100){
            System.out.println(" The person is having fever and his body temperature is: " + temperature);

        } else {
            System.out.println(" The person is not having fever and his body temperature is: " + temperature);

        }
    }
}
