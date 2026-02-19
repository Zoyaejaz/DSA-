import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Unionsortedarr {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 4, 4, 5, 6};

        List<Integer> result = findUnion(arr1, arr2);
        System.out.println("Union: " + result);
    }
    /*public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        // Step 1: Use a Set to store elements (Sets do not allow duplicates)
        // We use TreeSet to keep the result sorted automatically

        //Brute Force Approach
        // Time Complexity: O((n + m) log(n + m)) due to sorting in TreeSet
        // Space Complexity: O(n + m) for the set to store unique elements
        Set<Integer> set = new TreeSet<>();

        // Step 2: Add all elements from the first array
        for (int num : arr1) {
            set.add(num);
        }

        // Step 3: Add all elements from the second array
        for (int num : arr2) {
            set.add(num);
        }

        // Step 4: Convert the set back to a List to return it
        return new ArrayList<>(set);
    } */

    // Optimal Approach for sorted arrays
    // Time Complexity: O(n + m)    
    // Space Complexity: O(n + m) for the list to store the union
    public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0;
        List<Integer> union = new ArrayList<>();

        while (i < n && j < m) {
            // Pick the smaller element to maintain sorted order
            if (arr1[i] <= arr2[j]) {
                // Only add if it's the first element or not a duplicate of the last added
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        // Add remaining elements from arr1 (if any)
        while (i < n) {
            if (union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements from arr2 (if any)
        while (j < m) {
            if (union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }
}
