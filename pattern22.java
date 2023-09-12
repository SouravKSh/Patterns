public class pattern22 {
    public static void main(String[] args) {
        int n = 9;
        int num = 0;
        for (int row = 0; row < n; row++) {
            num = row % 2 != 0 ? 1 : 0;
            for (int col = 0; col <= row; col++) {
                num = num == 0 ? 1 : 0;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1