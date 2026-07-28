public class sum_subarray_ranges {
    public static long subArrayRanges(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            int largest=nums[i];
            int smallest=nums[i];
            for(int j=i+1;j<nums.length;j++){
                largest=Math.max(largest,nums[j]);
                smallest=Math.min(smallest,nums[j]);
                sum=sum+(largest-smallest);
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr={1,2,3};
        long ans=subArrayRanges(arr);
        System.out.println(ans);
    }
}

//optimized approach: T.C=O(N), S.C=O(N)
/*public long subArrayRanges(int[] nums) {
        return sumSubarrayMaxs(nums) - sumSubarrayMins(nums);
    }

    // 1. Calculate Sum of Subarray Minimums
    private long sumSubarrayMins(int[] nums) {
        int n = nums.length;
        long sum = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        // Previous Smaller Element
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Next Smaller or Equal Element
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            sum += (long) nums[i] * left[i] * right[i];
        }

        return sum;
    }

    // 2. Calculate Sum of Subarray Maximums
    private long sumSubarrayMaxs(int[] nums) {
        int n = nums.length;
        long sum = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        // Previous Greater Element
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        stack.clear();

        // Next Greater or Equal Element
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        for (int i = 0; i < n; i++) {
            sum += (long) nums[i] * left[i] * right[i];
        }

        return sum;  */
