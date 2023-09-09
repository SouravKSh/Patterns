public class pattern16 {
    public static void main(String[] args) {
        int n = 7;
        long res = 1;
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }
            res = 1;

            System.out.print(1 + "   ");

            for (int col = 1; col < row; col++) {
                res = res * (row - col);
                res = res / col;
                System.out.print(res + "   ");
            }
            System.out.println();
        }
    }
}

// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
// 1 5 10 10 5 1
// 1 6 15 20 15 6 1
