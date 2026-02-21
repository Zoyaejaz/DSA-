import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Longestconsecutiveseq {
    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        int n = arr.length;

        // --- Brute Force Solution ---
        // Time Complexity: O(n^3) | Space Complexity: O(1)
        int longestBrute = 1;
        for (int i = 0; i < n; i++) {
            int x = arr[i];
            int count = 1;
            while (ls(arr, x + 1)) {
                x = x + 1;
                count++;
            }
            longestBrute = Math.max(longestBrute, count);
        }
        System.out.println("Brute Force Output: " + longestBrute);


        // --- Better Solution (Sorting) ---
        // Time Complexity: O(nlogn) | Space Complexity: O(1)
        Arrays.sort(arr); // Now: {1, 1, 1, 2, 3, 4, 100, 101, 102}
        
        int longestBetter = 1;
        int count = 0;
        int lastsmall = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] - 1 == lastsmall) {
                // Number is consecutive to the previous one
                count++;
                lastsmall = arr[i];
            } else if (arr[i] != lastsmall) {
                // Number is a new start (not a duplicate)
                count = 1;
                lastsmall = arr[i];
            }
            // If arr[i] == lastsmall, it's a duplicate; we just skip it
            longestBetter = Math.max(longestBetter, count);
        }
        System.out.println("Better Solution Output: " + longestBetter);

        // --- Optimal Solution (HashSet) ---
        // Time Complexity: O(n) | Space Complexity: O(n)
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int longestOptimal = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int counter = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum = currentNum + 1;
                    counter++;
                }
                longestOptimal = Math.max(longestOptimal, counter);
            }
        }
        System.out.println("Optimal Solution Output: " + longestOptimal);
    }

    // Helper method for Brute Force Linear Search
    private static boolean ls(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }
}