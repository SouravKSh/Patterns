public class pattern11 {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<n;row++){
            int space=0;
            for(space=0;space<row;space++){
                System.out.print(" ");
            }
            for(int col=0;col<n-row;col++)
                System.out.print("* ");
            System.out.println();
        }
    }
}

    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *
