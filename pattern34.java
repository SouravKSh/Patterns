public class pattern34 {
    public static void main(String[] args) {
        int n = 5;
        int num = 69;
        for (int row = 0; row < n; row++) {
            int m = num;
            for (int col = 0; col < n - row; col++) {
                System.out.print((char) m-- + " ");
            }
            num = num - 1;
            System.out.println();
        }
    }
}
//    E D C B A
//    D C B A
//    C B A
//    B A
//    A