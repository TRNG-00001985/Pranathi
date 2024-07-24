import java.util.*;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(prime(num));

    }

    public static boolean prime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;
        int sqr = (int) Math.sqrt(num);
        for (int i = 3; i < sqr; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}