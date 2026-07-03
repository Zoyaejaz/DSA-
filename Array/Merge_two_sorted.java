import java.util.*;
public class Merge_two_sorted {
    public  static int[] merge(int[] arr1, int[] arr2){
        //Brute force
        //Time complexity: O((n+m)log(n+m)) | Space complexity: O(n+m)
        int n=arr1.length;
        int m=arr2.length;
        int[] ans=new int[n+m];
        int left=0;
        int right=0;
        int index=0;
        while(left<n && right<m){
            if(arr1[left]<arr2[right]){
                ans[index++]=arr1[left++];
            }
            else{
                ans[index++]=arr2[right++];
            }
        }
        while(left<n){
            ans[index++]=arr1[left++];
        }
        while(right<m){
            ans[index++]=arr2[right++];
        }
        return ans;
    }
    //Optimal solution
    //Time complexity: O(n+m) | Space complexity: O(n+m)
    public static int[] mergeoptimal(int[]arr1,int[]arr2){
        int n=arr1.length;
        int m=arr2.length;
        int[] ans=new int[n+m];
        int left=n-1;
        int right=0;
        while(left>=0 && right<m){
            if(arr1[left]>arr2[right]){
                int temp=arr1[left];
                arr1[left]=arr2[right];
                arr2[right]=temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int index=0;
        for(int i=0;i<n;i++){
            ans[index++]=arr1[i];
        }
        for(int i=0;i<m;i++){
            ans[index++]=arr2[i];
        }
        return ans;
    }
    //Another optimal solution(gap method)
        //Time complexity: O((n+m)log(n+m)) | Space complexity: O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n;

        int gap = (len / 2) + (len % 2);  // ceil(len/2)

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
                // Case 1: both pointers in nums1
                if (left < m && right < m) {
                    if (nums1[left] > nums1[right]) {
                        int temp = nums1[left];
                        nums1[left] = nums1[right];
                        nums1[right] = temp;
                    }
                }
                // Case 2: left in nums1, right in nums2
                else if (left < m && right >= m) {
                    if (nums1[left] > nums2[right - m]) {
                        int temp = nums1[left];
                        nums1[left] = nums2[right - m];
                        nums2[right - m] = temp;
                    }
                }
                // Case 3: both pointers in nums2
                else {
                    if (nums2[left - m] > nums2[right - m]) {
                        int temp = nums2[left - m];
                        nums2[left - m] = nums2[right - m];
                        nums2[right - m] = temp;
                    }
                }

                left++;
                right++;
            }

            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);  // ceil(gap/2)
        }

        // copy nums2 into nums1
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
    }
}
    public static void main(String[] args) {
        int[] arr1={1,3,5,7};
        int[] arr2={2,4,6,8};
        int[] ans=mergeoptimal(arr1,arr2);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
