public class pattern19 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < 2 * n; row++) {
            //left stars
            int leftStar = row < n ? row : 2 * n - row;
            for (int col = 0; col < leftStar; col++)
                System.out.print("*");
            //middle spaces
            int midSpace = 2 * n - 2 * leftStar;
            for (int space = 0; space < midSpace; space++)
                System.out.print(" ");
            //right stars
            for (int col = 0; col < leftStar; col++)
                System.out.print("*");
            System.out.println();
        }
    }
}

//    *        *
//    **      **
//    ***    ***
//    ****  ****
//    **********
//    ****  ****
//    ***    ***
//    **      **
//    *        *