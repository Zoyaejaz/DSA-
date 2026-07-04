package Binary_search;

public class search_in_sortedarray {
     public int search(int[] nums, int target) {
        int ans=-1;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ans=i;
            }
        }
        return ans;
     }
     /**public int search1(int[] nums,int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=nums[low]){
                if(target>=nums[low] && target<=nums[mid]){ //this is the condition to check if the target is in the left sorted part of the array and check whether the left part is sorted or not
                    high=mid-1;
                } 
                else{
                    low=mid+1;
                }
            }
            else{
                if(target>nums[mid] && target<=nums[high]){ //this is the condition to check if the target is in the right sorted part of the array and check whether the right part is sorted or not
                    low=mid+1;
                } 
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
     } **/
     public static void main(String[] args){
        search_in_sortedarray obj=new search_in_sortedarray();
        int[] arr={4,5,6,7,1,2,3};
        int target=5;
        int ans=obj.search(arr,target);
        System.out.println("The index of "+target+" is: "+ans);
}
}
