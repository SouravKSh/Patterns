public class pattern32 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < n; row++) {
            int E = 69 - row;
            for (int col = 0; col <= row; col++) {
                System.out.print((char) E++ + " ");
            }
            System.out.println();
        }
    }
}

// E
// D E
// C D E
// B C D E
// A B C D E