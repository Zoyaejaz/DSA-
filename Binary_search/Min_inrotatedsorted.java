package Binary_search;

public class Min_inrotatedsorted {
    public int findMin(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            if (nums[low] <= nums[high]) {
                ans = Math.min(ans, nums[low]);
                break;
            }
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans,nums[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Min_inrotatedsorted obj=new Min_inrotatedsorted();
        int[] arr={4,5,6,7,0,1,2};
        int ans=obj.findMin(arr);
        System.out.println("The minimum element in the rotated sorted array is: "+ans);
    }
}
