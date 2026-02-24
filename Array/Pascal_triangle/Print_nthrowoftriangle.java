package Pascal_triangle;

public class Print_nthrowoftriangle {
    public static void main(String[] args) {
        int n=5;
        //brute force approach
        //Time complexity: O(n^2), Space complexity: O(1)
        //in this approach we have to calculate the value of each element in the row using the formula nCr=n!/r!(n-r)!
        for(int i=0;i<n;i++){
            int res=1;
            for(int j=0;j<=i;j++){
                System.out.print(res+" ");
                res=res*(i-j);
                res=res/(j+1);
            }
            System.out.println();
        }

        //Optimal approach
        //Time complexity: O(n), Space complexity: O(1)
        int ans=1;
        System.out.print(ans+" ");
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }
    }
}
