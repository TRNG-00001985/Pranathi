import java.util.*;

public class MaxminusMin {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 7, 8, 2 };
        Arrays.sort(arr);

        System.out.println(arr[arr.length - 1] - arr[0]);
    }
}