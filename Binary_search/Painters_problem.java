package Binary_search;

public class Painters_problem {
    public static boolean isFeasible(int[] units, int M, int maxwalls) {
        int worker_count = 1;
        int sum = 0;
        
        for (int unit : units) {
            // Optional check: mid will never be less than an individual unit 
            // if 'low' is initialized to the maximum element.
            if (unit > maxwalls) {
                return false;
            }
            
            if (sum + unit > maxwalls) {
                worker_count++;
                sum = unit;
                if (worker_count > M) {
                    return false;
                }
            } else {
                sum += unit;
            }
        }
        return true; // FIX: Return true if allocation is successful
    }

    public static int allocate(int[] units, int M) {
        int N = units.length;
        if (N < M) {
            return -1;
        }
        
        int low = 0;
        int high = 0;
        for (int unit : units) {
            low = Math.max(low, unit); 
            high += unit;              
        }

        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // FIX: Pass arguments in the correct order (M, mid)
            if (isFeasible(units, M, mid)) {
                result = mid;
                high = mid - 1; // Try to find a smaller maximum
            } else {
                low = mid + 1;  // Increase the limit
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] units = {10, 20, 30, 40};
        int workers = 2;

        int minMaxUnits = allocate(units, workers);
        System.out.println("The minimum possible value of the maximum units is: " + minMaxUnits);
        // Expected Output: 60 (Worker 1 gets 10+20+30 = 60, Worker 2 gets 40)
    }
}