public class pattern17 {
    public static void main(String[] args) {
        int n = 10;
        for (int row = 0; row < n; row++) {
            int space;
            for (space = 0; space < n - row - 1; space++)
                System.out.print(" ");
            int countNumber = 2 * (row + 1) - 1;
            int num = row + 1;
            for (int col = 0; col < countNumber; col++) {
                if (countNumber / 2 > col) {
                    System.out.print(num);
                    num--;
                } else {
                    System.out.print(num);
                    num++;
                }
            }
            System.out.println();
        }
    }
}

// 1
// 212
// 32123
// 4321234
// 32123
// 212
// 1