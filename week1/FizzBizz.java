import java.util.*;

public class FizzBizz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Bizz");
        } else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBizz");
        } else {
            System.out.println("Try again");
        }

    }
}