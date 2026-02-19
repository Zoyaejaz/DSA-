import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        //Brute Force Approach
        // Time Complexity: O(n^2) due to nested loops
        // Space Complexity: O(1) as we are not using any extra space
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Indices: " + i + ", " + j);
                    return;
                }
            }
        }

        //Better Approach using HashMap
        // Time Complexity: O(n logn) due to single pass through the array
        // Space Complexity: O(n) for the HashMap to store elements
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + ", " + i);
                return;
            }
            map.put(arr[i], i);
        }

        //Optimal Approach for sorted arrays using Two Pointers
        // Time Complexity: O(n) due to single pass through the array
        // Space Complexity: O(1) as we are using only two pointers
        int left = 0, right = arr.length - 1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("Indices: "+ left+", "+right);
                return;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        
    }
}
