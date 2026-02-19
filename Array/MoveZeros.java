import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 0, 1};
        
        moveZerosToEnd(arr);
        
        System.out.println("Array after moving zeros: " + Arrays.toString(arr));
    }
// Optimal Approach, we are using two pointers approach 
// Time Complexity: O(n)
// Space Complexity: O(1)
    public static void moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int j = -1;

        // 1. Find the index of the first zero
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // If no zeros are found, we are done
        if (j == -1) return;

        // 2. Iterate from the first zero index and swap non-zeros with j
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                // Move j to the next zero position
                j++;
            }
        }
    }
}