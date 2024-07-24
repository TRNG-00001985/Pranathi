import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        System.out.println("gcd is" + find(x, y));
    }

    public static int find(int x, int y) {
        if (y == 0)
            return x;

        return find(y, x % y);
    }
}