public class pattern21 {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(++count);
                if (count <= 9)
                    System.out.print("  ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

// 1
// 2  3
// 4  5  6
// 7  8  9  10
// 11 12 13 14 15