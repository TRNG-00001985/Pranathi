import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println((Arrays.stream(arr).sum()) / arr.length);
    }
}