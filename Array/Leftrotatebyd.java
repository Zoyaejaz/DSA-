public class Leftrotatebyd {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int d=4;
        //Time Complexity: O(n)
        //Space Complexity: O(d)

        /* int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        } 
        for(int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }
        for(int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
        System.out.print("Array after left rotation by "+d+": ");
        for(int i=0;i<n;i++){   
            System.out.print(arr[i]+" ");
        } */

        //Optimal aaproach 
        //Time Complexity: O(n)
        //Space Complexity: O(1)
        d=d%n; //in case d>n
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.print("\nArray after left rotation by "+d+" using optimal approach: ");
        for(int i=0;i<n;i++){   
            System.out.print(arr[i]+" ");
        }
    }
    private static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
