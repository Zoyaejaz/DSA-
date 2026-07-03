public class Reversepairs {
    public static void main(String[] args){
        int[] arr={40,25,19,129,6,2};
        int n=arr.length;

        //Brute force approach
        //Time complexity: O(n^2), Space complexity: O(1)
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]>2*arr[j] && i<j){
                    count++;
                }
            }
        }
        System.out.println(count);

        //Optimal approach using Merge Sort
        //Time complexity: O(nlogn), Space complexity: O(n)
        int[] temp=new int[n];
        int ans=mergeSort(arr,temp,0,n-1);
        System.out.println(ans);
    }
        private static int mergeSort(int[] arr, int[] temp, int low, int high){
        int invCount = 0;
        if(low < high){
            int mid = low + (high-low) / 2;
            invCount += mergeSort(arr, temp, low, mid);
            invCount += mergeSort(arr, temp, mid+1, high);
            invCount += merge(arr, temp, low, mid, high);
        }
        return invCount;
    }
    
    private static int merge(int[] arr, int[] temp, int low, int mid, int high){
        int invCount = 0;
        
        // Count reverse pairs across the two halves
        int countJ = mid + 1;
        for(int i = low; i <= mid; i++){
            while(countJ <= high && (long)arr[i] > 2L * arr[countJ]){
                countJ++;
            }
            invCount += countJ - (mid + 1);
        }
        
        // Now perform normal merge
        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        
        while (j <= high) {
            temp[k++] = arr[j++];
        }

        for (int p = low; p <= high; p++) {
            arr[p] = temp[p];
        }
        
        return invCount;

    }
}
