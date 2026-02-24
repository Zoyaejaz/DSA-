package Pascal_triangle;

public class Print_Pascaltriangle {
    public static void main(String[] args) {
        int n=5;
        //brute force approach
        //Time complexity: O(n^3), Space complexity: O(1)
        //we will use the formula nCr=n!/r!(n-r)!
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                int res=1;
                for (int k=0;k<j;k++){
                    res=res*(i-k);
                    res=res/(k+1);
                }
                System.out.print(res+" ");
            }
            System.out.println();
        }

        //Optimal approach
        //Time complexity: O(n^2), Space complexity: O(1)
        for(int i=0;i<n;i++){
            int res=1;
            for(int j=0;j<=i;j++){
                System.out.print(res+" ");
                res=res*(i-j);
                res=res/(j+1);
            }
            System.out.println();
        }
    }
}
