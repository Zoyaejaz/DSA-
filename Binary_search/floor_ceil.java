package Binary_search;

public class floor_ceil {
    public static void find(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        int floor=-1;
        int ceil=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                floor=arr[mid];
                ceil=arr[mid];
                break;
            } else if(arr[mid]<x){
                floor=arr[mid];
                low=mid+1;
            } else{
                ceil=arr[mid];
                high=mid-1;
            }
        }
        System.out.println("Floor: "+floor);
        System.out.println("Ceil: "+ceil);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 10,12,15,19,20};
        int target = 5;

        find(arr, target);
    }
}
