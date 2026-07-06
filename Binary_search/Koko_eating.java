package Binary_search;

public class Koko_eating {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findmax(piles);
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int total = calculatehour(piles, mid);
            
            if (total <= h) {
                high = mid - 1; // Try to find a smaller valid speed
            } else {
                low = mid + 1;  // Speed is too slow, increase it
            }
        }
        return low;
    }

    // Helper method 1: Extracted outside minEatingSpeed
    private int findmax(int[] piles) {
        int max = Integer.MIN_VALUE; // Fixed capitalization
        int n = piles.length;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, piles[i]);
        }
        return max;
    }

    // Helper method 2: Extracted outside and renamed parameter 'h' to 'speed' for clarity
    private int calculatehour(int[] piles, int speed) {
        int total = 0;
        int n = piles.length;
        for (int i = 0; i < n; i++) {
            // Fixed Math.ceil syntax
            total += Math.ceil((double) piles[i] / (double) speed);
        }
        return total;
    } 
    public static void main(String[] args) {
        Koko_eating obj=new Koko_eating();
        int[] arr={3,6,7,11};
        int h=8;
        int ans=obj.minEatingSpeed(arr,h);
        System.out.printf("Koko will eat all bananas is %d hour",ans);
    }
}
