public class Setmatrixzeros {
    
    public static void main(String[] args){
        int[][] arr={{1,1,1},{1,0,1},{1,1,1}};
        int n=arr.length;
        int m=arr[0].length;
        //Brute force
        //Time complexity: O(n^3) | Space complexity: O(1)
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    Markrow(arr,i,m);
                    Markcol(arr,j,n);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==-1){
                    arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    //Better solution
    //Time complexity: O(2*n*m) | Space complexity: O(n)+O(m)
    int[] rowMark = new int[n];
    int[] colMark = new int[m];
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr[i][j]==0){
                rowMark[i]=1;
                colMark[j]=1;
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(rowMark[i]==1 || colMark[j]==1){
                arr[i][j]=0;
            }
        }
    }
    //Optimal solution
    //Time complexity: O(n*m) | Space complexity: O(1)
    boolean isCol=false;
    for(int i=0;i<n;i++){
        if(arr[i][0]==0){
            isCol=true;
        }
        for(int j=1;j<m;j++){
            if(arr[i][j]==0){
                arr[0][j]=0;
                arr[i][0]=0;
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=1;j<m;j++){
            if(arr[0][j]==0 || arr[i][0]==0){
                arr[i][j]=0;
            }
        }
    }
    if(isCol){
        for(int i=0;i<n;i++){
            arr[i][0]=0;
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    }
    private static void Markrow(int[][] arr, int row, int m){
            for(int j=0;j<m;j++){
                if(arr[row][j]!=0){
                    arr[row][j]=-1;
                }
            }
        }
        private static void Markcol(int[][] arr, int col, int n){
            for(int i=0;i<n;i++){
                if(arr[i][col]!=0){
                    arr[i][col]=-1;
                }
            }
        }
}
