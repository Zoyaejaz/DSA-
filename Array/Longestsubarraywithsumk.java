import java.util.HashMap;
public class Longestsubarraywithsumk {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,7,5};
        int k=7;
        int n=arr.length;
        int length=0;
        //Brute Force Approach
        // Time Complexity: O(n^2) due to nested loops
        // Space Complexity: O(1) as we are not using any extra space
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    length=Math.max(length,j-i+1);
                }
            }
        }
        System.out.println("Length of longest subarray with sum k: "+length);

        //Better Approach using HashMap
        // Time Complexity: O(n) due to single pass through the array
        // Space Complexity: O(n) for the HashMap to store prefix sums
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                length=Math.max(length,i+1);
            }
            if(map.containsKey(sum-k)){
                length=Math.max(length,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }

        //Optimal Approach using Sliding Window (only for non-negative numbers)
        // Time Complexity: O(n) due to single pass through the array   
        // Space Complexity: O(1) as we are using only two pointers
        int left=0;int right=0;
        sum=0;  
        while(right<n){
            sum+=arr[right];
            while(sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                length=Math.max(length,right-left+1);
            }
            right++;
        }
    }
}
