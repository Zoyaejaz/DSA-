public class Quick {
    public static void main(String[] args){
        int[] arr={35,50,15,25,80,20,90,45};
        int n=arr.length;
        quicksort(arr,0,n-1);
        System.out.println("Sorted array is: ");
        for(int i=0;i<n;i++){   
            System.out.print(arr[i]+" ");
        }
    }
    private static void quicksort(int[] arr,int low,int high){
        if(low<high){
            int pivot=partition(arr,low,high);
            quicksort(arr,low,pivot-1);
            quicksort(arr,pivot+1,high);
        }
    }
    private static int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low+1;
        int j=high;
        while(i<=j){
            while(arr[i]<=pivot && i<=high){
                i++;
            }
            while(arr[j]>pivot && j>=low){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
}
