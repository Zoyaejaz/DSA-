public class Sortarr {
    public static void main(String[] args) {
        int arr[]={0,1,2,0,1,2,1,2,0,0,0,1};
        int n=arr.length;
        //Brute Force Approach
        // Time Complexity: O(2n) due to sorting and then iterating through the array
        // Space Complexity: O(1) as we are sorting in place
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                cnt0++;
            }
            else if(arr[i]==1){
                cnt1++;
            }
            else{
                cnt2++;
            }
        }
        for(int i=0;i<cnt0;i++){
            arr[i]=0;
        }
        for(int i=cnt0;i<cnt0+cnt1;i++){
            arr[i]=1;
        }
        for(int i=cnt0+cnt1;i<n;i++){
            arr[i]=2;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        //Optimal Approach using Dutch National Flag Algorithm
        // Time Complexity: O(n) due to single pass through the array   
        // Space Complexity: O(1) as we are using only three pointers
        int low=0;int mid=0;int high=n-1;
        while(mid<high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        }
    }

