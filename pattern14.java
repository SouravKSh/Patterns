public class pattern14 {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<n;row++){
            if(row==0){
                for(int star=0;star<2*n-1;star++)
                    System.out.print("*");
                System.out.println();
            }
            else{
                //left space
                int space;
                for(space=0;space<row;space++)
                    System.out.print(" ");
                //left stars
                if(row!=n-1)
                System.out.print("*");
                //middle space
                for(int s=0;s<n-2*space+2;s++)
                    System.out.print(" ");
                System.out.println("*");
            }

        }
    }
}
    //  ********* 0
    //   *     *  1
    //    *   *   2  
    //     * *    3  
    //      *     4