import java.util.Arrays;

public class GetMaxandMin {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 43, 6, 3, 7 };
        System.out.println("Max num is" + Arrays.stream(arr).max());
        System.out.println("Min num is" + Arrays.stream(arr).min());
    }
}