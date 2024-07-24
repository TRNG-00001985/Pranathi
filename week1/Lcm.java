import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int ans = find(x, y);
        System.out.println((x * y) / ans);
    }

    public static int find(int x, int y) {
        if (y == 0)
            return x;
        return find(y, x % y);
    }
}