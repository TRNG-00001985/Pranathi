import java.util.*;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 7, 4, 5 };
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                continue;
            } else {
                System.out.println("Not Sorted ");
                return;
            }
        }
        System.out.println("IS Sorted");
    }
}