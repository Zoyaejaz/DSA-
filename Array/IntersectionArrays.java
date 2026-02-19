import java.util.*;

public class IntersectionArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 6, 7};

        List<Integer> result = findIntersection(arr1, arr2);
        System.out.println("Intersection: " + result);
    }

    //Brute Force Approach
    // Time Complexity: O(n * m)
    // Space Complexity: O(1)
    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        List<Integer> intersection = new ArrayList<>();
        // Visited array to keep track of elements in arr2 already included in intersection
        int[] visited = new int[arr2.length]; 

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                // If elements match and arr2[j] hasn't been used yet
                if (arr1[i] == arr2[j] && visited[j] == 0) {
                    intersection.add(arr1[i]);
                    visited[j] = 1; // Mark as visited
                    break; // Move to the next element in arr1
                }
                
                // Optimization: since it's sorted, if arr2[j] > arr1[i], 
                // no need to check further in arr2 for this arr1[i]
                if (arr2[j] > arr1[i]) break;
            }
        }
        return intersection;
    }

    // Optimal Approach for sorted arrays
    // Time Complexity: O(n + m)
    // Space Complexity: O(min(n, m)) for the list to store the intersection
    public static List<Integer> findIntersectionOptimal(int[] arr1, int[] arr2){
        List<Integer> intersection = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                // To avoid duplicates in the intersection result
                if (intersection.isEmpty() || intersection.get(intersection.size() - 1) != arr1[i]) {
                    intersection.add(arr1[i]);
                }
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return intersection;
    }
}
