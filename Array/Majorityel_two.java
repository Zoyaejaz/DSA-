import java.util.List;
import java.util.ArrayList;

public class Majorityel_two {
    public static void main(String[] args) {
        //Here we have to find the majority element in the array which is the element that appears more than n/3 times in the array
        int[] arr={1,1,1,3,3,2,2,2};
        int n=arr.length;
        //Brute force approach
        //Time complexity: O(n^2), Space complexity: O(1)
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/3){
               list.add(arr[i]);
            }
        }
        System.out.println(list);
        //optimal approach
        //Time complexity: O(n), Space complexity: O(1)
        int count1=0,count2=0,el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]==el1){
                count1++;
            }
            else if(arr[i]==el2){
                count2++;
            }
            else if(count1==0 && arr[i]!=el2){
                el1=arr[i];
                count1=1;
            }
            else if(count2==0 && arr[i]!=el1){
                el2=arr[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == el1) count1++;
            else if (arr[i] == el2) count2++;
        }
        if(count1>n/3){
            list.add(el1);
        }
        if(count2>n/3){
            list.add(el2);
        }
        System.out.println(list);

    }
}
