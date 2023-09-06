public class pattern5 {
    public static void main(String[] args) {
        int n=5;
        for(int row=0; row < 2*n; row++){
            int colStar = row < 5 ? row :  2*n - row;
            for(int col=0; col<colStar; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *