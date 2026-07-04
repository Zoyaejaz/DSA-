package Binary_search;

public class search_in_sortedtwo {
    public boolean search(int[] nums, int target) {
       int low=0;
       int high=nums.length-1;
       while(low<=high){
        int mid=low+(high-low)/2;
        if(nums[mid]==target){
            return true;
        }
        if(nums[low]==nums[mid] && nums[mid]==nums[high]){
            low=low+1;
            high=high-1;
            continue;
        }
        if(nums[low]<=nums[mid]){
            if(nums[low]<=target && target<nums[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        else{
            if(nums[mid]<target && nums[high]>=target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
       }
       return false;
    }
    public static void main(String[] args){
        search_in_sortedtwo obj=new search_in_sortedtwo();
        int[] arr={2,5,6,0,0,1,2};
        int target=0;
        boolean ans=obj.search(arr,target);
        System.out.println("The target "+target+" is present in the array: "+ans);
    }
}
