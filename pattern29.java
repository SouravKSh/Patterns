public class pattern29 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < 2 * n - 1; row++) {
            for (int col = 0; col < 2 * n; col++) {
                if (row < n) {
                    if (col <= row || col >= 2 * n - row - 1) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                } else {
                    if (col < 2 * n - row - 1 || col > row) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

//    *        *
//    **      **
//    ***    ***
//    ****  ****
//    **********
//    ****  ****
//    ***    ***
//    **      **
//    *        *