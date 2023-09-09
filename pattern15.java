public class pattern15 {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<2*n-1;row++)
        {
            //left space
            int leftSpace = row<n ? n-row-1 : row-n+1; 
            for(int space=0;space<leftSpace;space++)
                System.out.print(" ");
            //left star
            System.out.print("*");
            if(row!=0 && row<2*n-2){
                //middle space
                int midSpace = row < n ? 2*row-1 : 2*n-3-2*leftSpace;
                for(int space=0;space<midSpace;space++)
                    System.out.print(" ");
                //right star
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

    //      *
    //     * *
    //    *   *
    //   *     *
    //  *       *
    //   *     *
    //    *   *
    //     * *
    //      *
