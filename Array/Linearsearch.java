public class Linearsearch {
    public static void main(String[] args){
        //Time Complexity: O(n) , Space Complexity: O(1)
        int[] arr={2,56,34,90,54,12,87};
        int n=arr.length;
        int m=90; //element to be searched
        for(int i=0;i<n;i++){
            if(arr[i]==m){
                System.out.println("Element found at index: "+i);
                return;
            }
        }
        System.out.println("Element not found in the array");
    }
}
