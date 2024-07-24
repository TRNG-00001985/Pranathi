import java.util.*;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 4 };
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.println("Contains Duplicates");
                return;
            }
        }
        System.out.println("Does not Contains Duplicates");
    }
}