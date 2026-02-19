import java.util.Arrays;

public class Largestel {
    public static void main(String[] args){
        int[] arr={23,89,60,1,57,34,90,12};
        //Brute Force-- T.C==O(nlogn), S.C==O(1)
        Arrays.sort(arr);
        System.out.println("Largest element is: "+arr[arr.length-1]);

        //Optimal Solution--Time Comp==O(n), Space Comp==O(1)
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest element is: "+max); 

    }
}
