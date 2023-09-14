public class pattern28 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < 2 * n - 1; row++) {
            int colSpace = row < n ? n - row - 1 : row - n + 1;
            for (int space = 0; space < colSpace; space++)
                System.out.print(" ");
            int colStar = row < n ? row + 1 : n - colSpace;
            for (int col = 0; col < colStar; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//      *
//     * *
//    * * *
//   * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *
