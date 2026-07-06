package Binary_search;

public class min_days {
    // 1. Renamed main method to minDays to avoid conflict with the helper method
    public int minDays(int[] bloom, int m, int k) {
        // Edge case check
        if ((long) m * k > bloom.length) return -1;

        // Find the actual search range based on bloom days
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int val : bloom) {
            low = Math.min(low, val);
            high = Math.max(high, val);
        }

        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // Fixed method target and variable names
            if (possible(bloom, mid, m, k)) {
                ans = mid;
                high = mid - 1; // Try to find a smaller day
            } else {
                low = mid + 1;  // Need more days
            }
        }
        return ans;
    }

    // Helper method to check if 'm' bouquets can be made by 'day'
    boolean possible(int[] bloom, int day, int m, int k) {
        int cnt = 0;
        int noboq = 0;
        
        for (int i = 0; i < bloom.length; i++) { // Fixed .size to .length
            if (bloom[i] <= day) {
                cnt++;
                // Once we hit k adjacent flowers, make a bouquet immediately
                if (cnt == k) {
                    noboq++;
                    cnt = 0; 
                }
            } else {
                // Adjacency broken, reset counter
                cnt = 0;
            }
        }
        // Return check shifted outside the loop so it completes checking the whole array
        return noboq >= m;
    }
    public static void main(String[] args) {
        min_days obj=new min_days();
        int[] bloom={7,7,7,7,13,11,12,7};
        int m=2;
        int k=3;
        int ans=obj.minDays(bloom, m, k);
        System.out.printf("Minimum number of days it take to bloom these %d bouquets: %d",m,ans);;
    }
}