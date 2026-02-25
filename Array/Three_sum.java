import java.util.*;
public class Three_sum {
    public static void main(String[] args) {
        int[] arr={-1,0,1,2,-1,-4};
        int n=arr.length;
        //Brute force 
        //Time complexity: O(n^3), Space complexity: O(1)
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0 && i!=j && j!=k && i!=k){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        Collections.sort(temp);
                        if(!list.contains(temp)){
                            list.add(temp);
                        }
                    }
                }
            }
        }
        System.out.println(list);


    }
}
