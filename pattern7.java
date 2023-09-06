public class pattern7 {
    public static void main(String[] args) {
        int n=5;
        for(int row=n;row>0;row--){
            int space = 0;
            for(space=n-row;space>0;space--)
                System.out.print(" ");
            for(int col=row;col>0;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// *****
//  ****
//   ***
//    **
//     *