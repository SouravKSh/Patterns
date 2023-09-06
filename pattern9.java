public class pattern9 {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<n;row++){

            int space=0;

            for(space=0;space<row;space++)
                System.out.print(" ");

            int colStar = 2*n-2*row-1;

            for(int col=0;col<colStar;col++)
                System.out.print("*");
                
            System.out.println();
        }
    }
}

    // *********
    //  *******
    //   *****
    //    ***
    //     *