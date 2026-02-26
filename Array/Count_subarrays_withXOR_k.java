import java.util.*;
public class Count_subarrays_withXOR_k {
    public static void main(String[] args){
        int[] arr={4,2,2,6,4};
        int k=6;
        int n=arr.length;
        //Brute force approach
        //Time complexity: O(n^3), Space complexity: O(1)
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int xor=0;
                for(int l=i;l<=j;l++){
                    xor^=arr[l];
                }
                if(xor==k){
                    count++;
                }
            }
        }
        System.out.println(count);

        //Better approach
        //Time complexity: O(n^2), Space complexity: O(1)
        int count1=0;
        for(int i=0;i<n;i++){
            int xor=0;
            for(int j=i;j<n;j++){
                xor^=arr[j];
                if(xor==k){
                    count1++;
                }
            }
        }
        System.out.println(count1);

        //Optimal approach
        //Time complexity: O(n), Space complexity: O(n)
        int count2=0;
        Map<Integer, Integer> map=new HashMap<>();
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=arr[i];
            if(xor==k){
                count2++;
            }
            if(map.containsKey(xor^k)){
                count2+=map.get(xor^k);
            }
            map.put(xor, map.getOrDefault(xor, 0)+1);
        }
        System.out.println(count2);
    }
}
