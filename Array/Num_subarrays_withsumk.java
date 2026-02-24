import java.util.HashMap;
public class Num_subarrays_withsumk {
    public static void main(String[] args){
        int[] arr={1,2,3,-3,1,1,1,4,2,-3};
        int k=3;
        int n=arr.length;
        //brute force approach
        //Time complexity: O(n^2), Space complexity: O(1)
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int l=i;l<=j;l++){
                    sum+=arr[l];
                }
                if(sum==k){
                    count++;
                }
            }
        }
        System.out.println(count);
        //Better approach
        //Time complexity: O(n^2), Space complexity: O(1)
        int count1=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    count1++;
                }
            }
        }
        System.out.println(count1);

        //Optimal approach
        //Time complexity: O(n), Space complexity: O(n)
        int count2=0;
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1); //to handle the case when sum is equal to k   
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                count2+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.println(count2);
    }
}
