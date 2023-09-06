public class pattern8 {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<n;row++){
            int space=0;
            for(space=n-row-1;space>0;space--)
            {
                System.out.print(" ");
            }
            for(int col=0;col<=2*row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

    //     *
    //    ***
    //   *****
    //  *******
    // *********