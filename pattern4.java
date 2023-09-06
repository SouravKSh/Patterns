public class pattern4 {
    public static void main(String[] args) {
        for(int row=0;row<5;row++){
            for(int col=0;col<=row;col++){
                System.out.print(col+1+" ");
            }
            System.out.println();
        }
    }
}
// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5