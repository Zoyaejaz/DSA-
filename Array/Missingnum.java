public class Missingnum {
    public static void main(String[] args){
        int[] arr={1,2,3,5};
        //Brute force
        /*for(int i=0;i<=5;i++){
            int flag=0;
            for(int j=0;j<5-1;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(i);
            }
        }
        //Better Approach
        int n=5;
        int[] hash = new int[n + 1];
        for (int i = 0; i < n; i++) {
            // Assuming arr[i] contains values between 0 and n
            hash[arr[i]] = 1; 
        }

        // 3. Check for the missing value
        for (int i = 1; i <= n; i++) { // Note: Changed to i <= n to match size n+1
            if (hash[i] == 0) {
                System.out.print(i);
            }
        } */
        //Optimal
        //1. summation
        /*int n=arr.length;
        int sum=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum2+=arr[i];
        }
        System.out.print(sum-sum2); */

        //2.XOR
        int n=5;
        int xorResult = n; // Start with n
        for (int i = 0; i < arr.length; i++) {
            xorResult ^= (i + 1) ^ arr[i];
        }
        System.out.println(xorResult);
    }
}
