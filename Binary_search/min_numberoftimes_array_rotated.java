package Binary_search;

public class min_numberoftimes_array_rotated {
    public class Solution {
        public int findRotationCount(int[] nums) {
            int low = 0;
            int high = nums.length - 1;
            int ans = Integer.MAX_VALUE;
            int index = 0; // Default to 0 (if array is not rotated)
            
            while (low <= high) {
                // If the current search space is already entirely sorted
                if (nums[low] <= nums[high]) {
                    if (nums[low] < ans) {
                        ans = nums[low];
                        index = low;
                    }
                    break;
                }
                
                int mid = low + (high - low) / 2; // Avoids integer overflow
                
                // If the left half is sorted
                if (nums[low] <= nums[mid]) {
                    if (nums[low] < ans) {
                        ans = nums[low];
                        index = low;
                    }
                    low = mid + 1; // Eliminate left half, search right
                } 
                // Otherwise, the right half is sorted
                else {
                    if (nums[mid] < ans) {
                        ans = nums[mid];
                        index = mid;
                    }
                    high = mid - 1; // Eliminate right half, search left
                }
            }
            return index; // The index of the minimum element = number of rotations
        }
    }

    public static void main(String[] args) {
        min_numberoftimes_array_rotated obj = new min_numberoftimes_array_rotated();
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        Solution sol = obj.new Solution();
        int rotationCount = sol.findRotationCount(arr);
        
        System.out.println("The array is rotated " + rotationCount + " times.");
    }
}