import java.util.HashMap;
public class Majorityelement {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,1,2,2};
        int n=arr.length;
        //Brute Force Approach
        // Time Complexity: O(n^2) due to nested loops
        // Space Complexity: O(1) as we are not using any extra space
        /*for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                    System.out.println("Majority element: "+arr[i]);
                    return;
                }
                else{
                    System.out.println("No majority element found");
                    return;
                }
        }

    //Better Approach using HashMap
        // Time Complexity: O(n logn) due to single pass through the array
        // Space Complexity: O(n) for the HashMap to store elements
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Integer key:map.keySet()){
            if(map.get(key)>n/2){
                System.out.println("Majority element: "+key);
                return;
            }
        } */

        //Optimal Approach using Boyer-Moore Voting Algorithm
        // Time Complexity: O(n) due to single pass through the array   
        // Space Complexity: O(1) as we are using only two variables
        int count=0;
        int candidate=1;
        for(int i=0;i<n;i++){
            if(count==0){
                candidate=arr[i];
            }
            if(arr[i]==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println("Majority element: "+candidate);
    }
}
