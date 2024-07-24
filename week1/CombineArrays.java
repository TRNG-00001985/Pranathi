import java.util.*;

public class CombineArrays {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 5, 6, 7, 8 };
        int[] arr = new int[a.length + b.length];
        System.arraycopy(a, 0, arr, 0, a.length);
        System.arraycopy(b, 0, arr, a.length, b.length);
        System.out.println(Arrays.toString(arr));
    }
}