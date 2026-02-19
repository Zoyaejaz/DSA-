import java.util.Arrays;

public class Secondlargestel {
    public static void main(String[] args){
        int[] arr={12,56,34,89,23,90,50,12};
        //Brute Force--T.C==O(nlogn), S.C==O(1)
        Arrays.sort(arr);
        /*int largest=arr[arr.length-1];
        for (int i=arr.length-2;i>=0;i--){
            if(arr[i]!=largest){
                System.out.println("Second largest element is: "+arr[i]);
                break;
            }
        }*/

        //Better Solution--Time Comp==O(2n), Space Comp==O(1)
       /*  int largest=arr[0];
        for(int i=0;i<arr.length;i++){ //it will take O(n) time
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        int Secondlargest=-1; //Assuming all elements are positive that's why we took -1 otherwise we can take Integer.MIN_VALUE
        for(int i=0;i<arr.length;i++){ //it will take O(n) time
            if(arr[i]>Secondlargest && arr[i]!=largest){
                Secondlargest=arr[i];
            } 
        }
        System.out.println("Second largest element is: "+Secondlargest); */

        //Optimal Solution--Time Comp==O(n), Space Comp==O(1)
        int largest=arr[0];
        int slargest=-1; //Assuming all elements are positive that's why we took -1 otherwise we can take Integer.MIN_VALUE   
        // similarly we can use this to find second smallest element also just take slargest=Integer.MAX_VALUE and change the conditions accordingly
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        System.out.println("Second largest element is: "+slargest);
    } 
}
