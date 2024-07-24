import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print((n & 1) == 0 ? "Even" : "Odd");
    }
}
