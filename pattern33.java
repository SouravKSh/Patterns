public class pattern33 {
    public static void main(String[] args) {
        int n = 5;
        int flag = 1;
        int num = 97;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                if (flag == 1)
                    System.out.print((char) num++ + " ");
                else
                    System.out.print((char) (num++ - 32) + " ");
                flag = flag == 1 ? 0 : 1;
            }
            System.out.println();
        }
    }
}
//    a
//    B c
//    D e F
//    g H i J
//    k L m N o
