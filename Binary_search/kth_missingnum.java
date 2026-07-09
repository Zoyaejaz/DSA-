package Binary_search;

public class kth_missingnum {
    public int find(int[] arr,int k){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k) low=mid+1;
            else{ high=mid-1;}
        }
        return high+1+k;
    }
    public static void main(String[] args){
        int[] arr={2,3,4,7,11};
        int k=5;
        kth_missingnum obj=new kth_missingnum();
        int ans=obj.find(arr,k);
        System.out.println(ans);
    }
}
