public class Rearrangeelbysign {
    public static void main(String[] args){
        int[] arr={3,1,-2,-5,2,-4};
        int n=arr.length;
        //Brute force approach: T.C=O(2n), S.C=O(n)
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int posIndex=0, negIndex=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos[posIndex++]=arr[i];
            }
            else{
                neg[negIndex++]=arr[i];
            }
        }
        for(int i=0;i<n/2;i++){
            arr[2*i]=pos[i];
            arr[2*i+1]=neg[i];
        }
        System.out.println("Rearranged array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        //Optimal approach: T.C=O(n^2), S.C=O(1) ---- Not sure about this approach, need to verify 
        for(int i=0;i<n;i++){
            if(i%2==0){ // Even position should have positive
                if(arr[i]<0){
                    // Find next positive
                    int j=i+1;
                    while(j<n && arr[j]<0) j++;
                    if(j<n){
                        // Rotate elements between i and j
                        int temp=arr[j];
                        for(int k=j;k>i;k--){
                            arr[k]=arr[k-1];
                        }
                        arr[i]=temp;
                    }
                }
            } else { // Odd position should have negative
                if(arr[i]>0){
                    // Find next negative
                    int j=i+1;
                    while(j<n && arr[j]>0) j++;
                    if(j<n){
                        // Rotate elements between i and j
                        int temp=arr[j];
                        for(int k=j;k>i;k--){
                            arr[k]=arr[k-1];
                        }
                        arr[i]=temp;
                    }
                }
            }
        }
        System.out.println("\nRearranged array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
