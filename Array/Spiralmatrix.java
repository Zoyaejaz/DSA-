public class Spiralmatrix {
    public static void main(String[] args) {
        int[][] mat={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int m=mat.length; //number of rows
        int n=mat[0].length; //number of columns
        int top=0, bottom=m-1, left=0, right=n-1;
        while(top<=bottom && left<=right){
            //traverse from left to right
            for(int i=left;i<=right;i++){
                System.out.print(mat[top][i]+" ");
            }
            top++;
            //traverse from top to bottom
            for(int i=top;i<=bottom;i++){
                System.out.print(mat[i][right]+" ");
            }
            right--;
            //traverse from right to left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    System.out.print(mat[bottom][i]+" ");
                }
                bottom--;
            }
            //traverse from bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(mat[i][left]+" ");
                }
                left++;
            }
        }
         
    }
}
