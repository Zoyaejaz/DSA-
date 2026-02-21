import java.util.*;
public class NextPermutation {
    public static void main(String[] args){
        int[] nums={1,2,3};
        int n=nums.length;
        //Optimal Solution
        //Time Complexity: O(n)
        //Space Complexity: O(1)
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(nums,0,n-1);
        } else {
            for(int i=n-1;i>index;i--){
                if(nums[index]<nums[i]){
                    int temp=nums[index];
                    nums[index]=nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            reverse(nums,index+1,n-1);
        }
        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
