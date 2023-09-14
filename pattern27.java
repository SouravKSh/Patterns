public class pattern27 {
    public static void main(String[] args) {
        int n = 4;
        int left = 0;
        int right = 0;
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < row; space++)
                System.out.print("  ");
            for (int col = 0; col < 2 * n - 2 * row; col++) {
                if (col < n - row) {
                    left = left + 1;
                    if (left == 4 || left == 7 || left == 9)
                        System.out.print(left + "  ");
                    else
                        System.out.print(left + " ");
                    right = left;
                } else {
                    System.out.print(n * (n + 1) - right + 1 + " ");
                    right = right - 1;
                }
            }
            System.out.println();
        }
    }
}
//   1 2 3 4  17 18 19 20
//     5 6 7  14 15 16
//       8 9  12 13
//         10 11
