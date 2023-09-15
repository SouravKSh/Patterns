public class pattern30 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n - row - 1; space++) {
                System.out.print("  ");
            }
            int colStar = 2 * row + 1;
            int count = row + 2;
            for (int col = 0; col < colStar; col++) {
                if (colStar / 2 >= col) {
                    count -= 1;
                    System.out.print(count + " ");
                } else {
                    count += 1;
                    System.out.print(count + " ");
                }
            }
            System.out.println();
        }
    }
}

//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5
