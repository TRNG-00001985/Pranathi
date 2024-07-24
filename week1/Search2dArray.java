public class Search2dArray {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 4, 3 } };
        int key = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Found element");
                    key = -1;
                    break;
                }
            }
        }
        if (key != -1) {
            System.out.println(" Not Found element");
        }
    }
}