public class pattern12 {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<2*n;row++){
            int spaceCount=row<5 ? row:2*n-row-1;
            for(int space=0;space<spaceCount;space++){
                System.out.print(" ");
            }
            int starCount= row<5 ? n-row : row-n+1;
            for(int col=0;col<starCount;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

    //  * * * * * 0
    //   * * * *  1
    //    * * *   2
    //     * *    3  
    //      *     4  
    //      *     5  
    //     * *    6  
    //    * * *   7  
    //   * * * *  8  
    //  * * * * * 9