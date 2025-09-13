package numbers;

public class EvenNumbersBetweenNineAndHundred {
    public static void main(String[] args) {
        for (int i = 9; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(" It's an even no: " + i);
            } else {
                System.out.println(" It's not an even no: " + i);
            }
        }
    }
}
