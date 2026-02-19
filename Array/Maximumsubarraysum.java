public class Maximumsubarraysum {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        int n=arr.length;
        //Brute Force--T.C==O(n^3), S.C==O(1)
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                maxSum=Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);

        //Better Solution--T.C==O(n^2), S.C==O(1)
        maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                maxSum=Math.max(sum, maxSum);
            }
        }
        System.out.println(maxSum);

        //Optimal Solution--T.C==O(n), S.C==O(1)
        maxSum=Integer.MIN_VALUE;
        int Sum=0;
        for(int i=0;i<n;i++){
            Sum+=arr[i];
            if(Sum>maxSum){
                maxSum=Sum;
            }
            if(Sum<0){
                Sum=0;
            }
        }
        System.out.println(maxSum);
    }
}
