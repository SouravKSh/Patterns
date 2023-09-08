public class pattern13{
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<n;row++){
            //left space
            for(int space=0;space<n-row;space++)
                System.out.print(" ");
            if(row>=0 && row<n-1){
                System.out.print("*");
                //middle space
                if(row!=0){
                    for(int space=0;space<2*row-1;space++)
                        System.out.print(" ");
                }
                //right star
                if(row<n-1 && row!=0)
                    System.out.print("*");
            }
            if(row==n-1){
                    for(int star=0;star<2*n-1;star++)
                        System.out.print("*");
            }
            System.out.println();
        }
    }
}
      
//     0     *
//     1    * *
//     2   *   *
//     3  *     *
//     4 *********