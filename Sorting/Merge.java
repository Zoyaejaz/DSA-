public class Merge {
    public static void main(String[] args){
        int[] arr={15,16,6,8,5,7};
        int n=arr.length;
        mergesort(arr,0,n-1);
        System.out.println("Sorted array is: ");
        for(int i=0;i<n;i++){   
            System.out.print(arr[i]+" ");
        }
    }
    private static void mergesort(int[] arr,int low,int high){
        if(low < high){
            int mid=(low+high)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    private static void merge(int[] arr,int low,int mid,int high){
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;

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

        for (int p = 0; p < temp.length; p++) {
            arr[low + p] = temp[p];
        }
    }
}
