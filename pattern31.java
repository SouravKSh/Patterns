public class pattern31 {
    public static void main(String[] args) {
        int n = 4;
        for (int row = 0; row < 2 * n - 1; row++) {
            for (int col = 0; col < 2 * n - 1; col++) {
                int num = n + 1 - Math.min(Math.min(col + 1, 2 * n - col - 1), Math.min(row + 1, 2 * n - row - 1));
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

//  4 4 4 4 4 4 4  
//  4 3 3 3 3 3 4   
//  4 3 2 2 2 3 4   
//  4 3 2 1 2 3 4   
//  4 3 2 2 2 3 4   
//  4 3 3 3 3 3 4   
//  4 4 4 4 4 4 4   