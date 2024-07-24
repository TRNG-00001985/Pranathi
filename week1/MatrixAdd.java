public class MatrixAdd {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 3, 4, 5 }, { 3, 4, 3 } };
        int[][] b = { { 1, 2, 3 }, { 3, 4, 5 }, { 3, 4, 3 } };
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
