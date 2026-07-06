package Binary_search;

public class Nth_root {
    
    // 1. Added parameter 'n' to find the n-th root
    public int findroot(int num, int n) {
        int low = 1;
        int high = num;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // f(mid, n, num) returns:
            // 1 if mid^n == num
            // 0 if mid^n < num
            // 2 if mid^n > num (with overflow prevention)
            int midn = f(mid, n, num);
            
            if (midn == 1) {
                return mid;
            } else if (midn == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Returns -1 if it's not a perfect n-th root
    }

    // Helper function using Binary Exponentiation with overflow prevention
    int f(int mid, int n, int num) {
        long ans = 1;
        long base = mid; // use long to prevent multiplication overflow
        
        while (n > 0) {
            if (n % 2 == 1) {
                ans = ans * base;
                n = n - 1;
            } else {
                base = base * base;
                n = n / 2;
            }
            
            // Early exit if the product already exceeds num
            if (ans > num || base > num && n > 0) {
                return 2; // mid^n is strictly greater than num
            }
        }
        
        if (ans == num) return 1;
        return 0; // mid^n is strictly less than num
    }

    public static void main(String[] args) {
        Nth_root obj = new Nth_root();
        int nums = 169;
        int n = 2; // Finding the square root (2nd root) of 169
        
        int ans = obj.findroot(nums, n);
        System.out.printf("The %d-th root of the given number %d is: %d%n", n, nums, ans);
    }
}