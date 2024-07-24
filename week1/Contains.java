import java.util.*;

public class Contains {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 8, 43, 36 };
        int key = s.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("Contains in the array");
                return;
            }
        }
        System.out.println("Not Contains in the array");
    }
}