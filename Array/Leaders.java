public class Leaders {
    public static void main(String[] args){
        int[] arr={10,22,12,3,0,6};
        int n=arr.length;
        //Brute Force Solution
        //Time Complexity: O(n^2)
        //Space Complexity: O(1)
        for(int i=0;i<n;i++){
            boolean leader=true;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    leader=false;
                    break;
                }
                else{
                    leader=true;
                }
            }
            if(leader){
                System.out.print(arr[i]+" ");
            }
        }
        //Optimal Solution
        //Time Complexity: O(n)
        //Space Complexity: O(1)
        int max=arr[n-1];
        System.out.print(max+" ");
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                System.out.print(max+" ");
            }
        }

    }
}
