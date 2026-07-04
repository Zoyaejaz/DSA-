package Binary_search;

public class first_and_last {
    public int[] find(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        int first=-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                if(arr[mid]==target){
                    first=mid;
                }
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        int low1=0;
        int high1=arr.length-1;
        while(low1<=high1){
            int mid1=(low1+high1)/2;
            if(arr[mid1]>target){
                high1=mid1-1;
            }
            else{
                if(arr[mid1]==target){
                    last=mid1;
                }
                low1=mid1+1;
            }

        }
        if(first!=-1 && arr[first]==target)
        return new int[]{first, last};
        else{
            return new int[]{-1, -1};
        }
    }
    public static void main(String[] args){
        first_and_last obj=new first_and_last();
        int[] arr={1,2,3,4,5,5,5,6,7};
        int target=5;
        int[] ans=obj.find(arr,target);
        System.out.println("First and last occurrence of "+target+" is: ["+ans[0]+", "+ans[1]+"]");
    }
}
