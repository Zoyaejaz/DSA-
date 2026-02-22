public class Remduplicates {
    public static void main(String[] args) {
        // this is optimal solution, T.C==O(n), S.C==O(1) , there is only one approach which is better than this and that is using hashset but that will take O(n) space
        int[] arr={1,2,2,3,3,3,4};
        int n=arr.length;
        int i=0; //pointer for next unique element
        for(int j=1;j<n;j++){ //j is for traversing the array
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println("Length of array after removing duplicates: "+(i+1));
        System.out.print("Array after removing duplicates: ");
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
