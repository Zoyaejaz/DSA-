package Binary_search;

public class single_element {
    //T.c=O(n) and S.c=O(1)
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(nums[i]!=nums[i+1]) ans=nums[i];
            }
            else if(i==nums.length-1){
                if(nums[i]!=nums[i-1]) ans=nums[i];
            }
            else{
                if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
                    ans=nums[i];
                }
            }
        }
        return ans;
    }

    public int singleNonDuplicate1(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) return nums[mid];
            if((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1])) { //it is helping in elimination the half of the array which is not containing the single element
                low = mid + 1;
            } else {
                high = mid-1;
            }
            }
        return -1;
    }
    public static void main(String[] args){
        single_element obj=new single_element();
        int[] arr={1,1,2,3,3,4,4,8,8};
        int ans=obj.singleNonDuplicate1(arr);
        System.out.println("The single element in the sorted array is: "+ans);
    }

}
