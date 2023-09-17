public class pattern35 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < n; row++) {
            int num = 1;
            for (int col = 0; col < 2 * n; col++) {
                if (col <= row) {
                    System.out.print(num++);
                } else if (col >= 2 * n - row - 1) {
                    System.out.print(--num);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321