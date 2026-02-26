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

        //Better approach
        //Time complexity: O(n^2), Space complexity: O(n)
        List<List<Integer>> list2=new ArrayList<>();
        for(int i=0;i<n;i++){
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=-(arr[i]+arr[j]);
                if(set.contains(third)){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(third);
                    Collections.sort(temp); //Sort the triplet to ensure uniqueness
                    if(!list2.contains(temp)){
                        list2.add(temp);
                    }
                }
                set.add(arr[j]); //Add the current element to the set for future checks 
            }
        }
        System.out.println(list2);

        //Optimal approach
        //Time complexity: O(n^2), Space complexity: O(1) (excluding the space for the output list)
        List<List<Integer>> list3=new ArrayList<>();
        Arrays.sort(arr); //Sort the array to use two-pointer technique 
        for(int i=0;i<n-2;i++){
            if(i>0 && arr[i]==arr[i-1]) continue; //Skip duplicates 
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==0){
                    list3.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    while(left<right && arr[left]==arr[left+1]) left++; //Skip duplicates 
                    while(left<right && arr[right]==arr[right-1]) right--; //Skip duplicates 
                    left++;
                    right--;
                } else if(sum<0){
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(list3);

    }
}
