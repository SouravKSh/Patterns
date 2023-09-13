public class pattern24 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < 2 * n; row++) {
            for (int col = 0; col < 2 * n; col++) {
                if (row == col || col == 0 || col == 2 * n - 1 || col == 2 * n - 1 - row) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//    *        *
//    **      **
//    * *    * *
//    *  *  *  *
//    *   **   *
//    *   **   *
//    *  *  *  *
//    * *    * *
//    **      **
//    *        *