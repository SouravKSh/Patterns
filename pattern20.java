public class pattern20 {
    public static void main(String[] args) {
        int n = 10;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - 1; col++) {
                if (row == 0 || row == n - 1) {
                    System.out.print("*");
                } else {
                    if (col == 0 || col == n - 2) {
                        System.out.print("*");
                    }
                    if (col > 0 && col < n - 1) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

//    ****
//    *  *
//    *  *
//    *  *
//    ****