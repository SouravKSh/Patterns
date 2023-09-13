public class pattern25 {
    public static void main(String[] args) {
        int n = 5, count = 0;
        for (int row = 0; row < n; row++) {
            //left spaces
            for (int space = 0; space < n - 1 - row; space++)
                System.out.print(" ");
            count = 0;
            for (int col = 0; col < n; col++) {
                if (row == 0 || row == n - 1)
                    System.out.print("*");
                else {
                    if (count == 0 || count == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                    count++;
                }
            }
            System.out.println();
        }
    }
}

//       *****
//      *   *
//     *   *
//    *   *
//   *****