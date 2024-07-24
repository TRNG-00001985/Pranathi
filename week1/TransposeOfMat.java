public class TransposeOfMat {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 3, 9 } };
        int[][] trans = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                trans[i][j] = arr[j][i];
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }

    }
}