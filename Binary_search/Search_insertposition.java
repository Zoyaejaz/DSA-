package Binary_search;

public class Search_insertposition {
    public static int find(int[] arr,int n){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=n){
                ans=mid;
                high=mid-1;
            } else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;

        int ans = find(arr, target);

        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Insert position index: " + ans);
        }
    }
}
