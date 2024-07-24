import java.util.Arrays;

public class ArraysareEqual {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr1 = { 1, 7, 3, 4, 5 };
        if (Arrays.equals(arr, arr1)) {
            System.out.println("Arrays are Equal");
        } else {
            System.out.println("Arrays are Not Equal");
        }
    }
}