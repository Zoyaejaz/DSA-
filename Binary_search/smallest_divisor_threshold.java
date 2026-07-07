package Binary_search;
import java.util.*;
public class smallest_divisor_threshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int num:nums){
            high=Math.max(high,num);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(sumofd(nums,mid)<=threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
     private int sumofd(int[] nums,int mid){
            int sum=0;
            int n=nums.length;
            for(int i=0;i<n;i++){
                sum=sum+(int)Math.ceil((double)(nums[i])/(double)(mid));
            }
            return sum;
        }
        public static void main(String[] args) {
            smallest_divisor_threshold obj=new smallest_divisor_threshold();
            int[] nums={1,2,5,9};
            int threshold=6;
            int ans=obj.smallestDivisor(nums,threshold);
            System.out.println(ans);
        }
}
