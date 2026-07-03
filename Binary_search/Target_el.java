package Binary_search;

public class Target_el {

    //Time complexity: O(log n)
    //Space complexity: O(1)
    //this is the iterative approach of binary search
    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    //Time complexity: O(log n)
    //Space complexity: O(log n) due to recursive stack space
    //This is the recursive approach of binary search
    public static int searchRecursive(int[] arr, int target, int low, int high) {
        if(low>high) return -1;
        int mid=low+(high-low)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]<target) return searchRecursive(arr, target,mid+1, high);
        else return searchRecursive(arr, target, low, mid-1);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9}; // fixed here
        int target = 5;

        int ans = searchRecursive(arr, target, 0, arr.length - 1);

        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + ans);
        }
    }
}