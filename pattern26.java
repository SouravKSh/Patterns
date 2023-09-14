public class pattern26 {
    public static void main(String[] args) {
        int n = 6;
        for (int row = 0; row < n; row++) {
            int colS = n - row;
            for (int col = 0; col < colS; col++) {
                System.out.print(row + 1 + " ");
            }
            System.out.println();
        }
    }
}
//   1 1 1 1 1 1
//   2 2 2 2 2
//   3 3 3 3
//   4 4 4
//   5 5
//   6
