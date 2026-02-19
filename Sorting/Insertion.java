public class Insertion {
    public static void main(String[] args){
        int[] arr={15,16,6,8,5};
        int n=arr.length;
        Insertionsort(arr);
        System.out.println("Sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Insertionsort(int[] arr){
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                //swap
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}
