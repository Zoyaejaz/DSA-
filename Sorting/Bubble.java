public class Bubble {
    public static void Bubblesort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int didswap=0;
            for(int j=0;j<n-i-1;j++){
                //swap
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didswap=1; //You can write this or not it's your choice. It's just an optimization.this means that If no swap happened then it means array is sorted.
                }
            }
            if(didswap==0){ //optimization to stop the algorithm if the array is already sorted
                break;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={5, 6, 8, 15, 16};
        Bubblesort(arr);
        System.out.println("Sorted array: ");;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
