public class pattern18 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < 2 * n; row++) {
            // creating left stars
            int leftStar = row < 5 ? n - row : row - n + 1;
            for (int col = 0; col < leftStar; col++) {
                System.out.print("*");
            }
            // middle spaces
            int midSpace = 2 * n - 2 * leftStar;
            for (int space = 0; space < midSpace; space++)
                System.out.print(" ");
            // creating right stars
            for (int col = 0; col < leftStar; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
      **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********
*/