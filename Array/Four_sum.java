import java.util.*;
public class Four_sum {
    public static void main(String[] args){
        int arr[]={1,0,-1,0,-2,2};
        int n=arr.length;
        int target=0;
        List<List<Integer>> list=new ArrayList<>();
        //Brute force approach
        //Time complexity: O(n^4), Space complexity: O(1)
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        if(arr[i]+arr[j]+arr[k]+arr[l]==target){
                            List<Integer> temp=new ArrayList<>();
                            temp.add(arr[i]);
                            temp.add(arr[j]);
                            temp.add(arr[k]);
                            temp.add(arr[l]);
                            Collections.sort(temp);//   Sort the quadruplet to ensure uniqueness
                            if(!list.contains(temp)){
                                list.add(temp);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(list);

        //Better approach
        //Time complexity: O(n^3), Space complexity: O(n)
        List<List<Integer>> list2=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                Set<Integer> set=new HashSet<>();
                int newTarget=target-(arr[i]+arr[j]);
                for(int k=j+1;k<n;k++){
                    if(set.contains(newTarget-arr[k])){
                        List<Integer> temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(newTarget-arr[k]);
                        Collections.sort(temp); //Sort the quadruplet to ensure uniqueness
                        if(!list2.contains(temp)){
                            list2.add(temp);
                        }
                    }
                    set.add(arr[k]); //Add the current element to the set for future checks 
                }
            }
        }
        System.out.println(list2);

        //Optimal approach
        //Time complexity: O(n^3), Space complexity: O(1) (excluding the space for the output list)
        List<List<Integer>> list3=new ArrayList<>();
        Arrays.sort(arr); //Sort the array to use two-pointer technique
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1 & arr[j]==arr[j-1]) continue;
                int left=j+1;
                int right=n-1;
                while(left<right){
                    int sum=arr[i]+arr[j]+arr[left]+arr[right];
                    if(sum==target){
                        list3.add(Arrays.asList(arr[i], arr[j], arr[left], arr[right]));
                        while(left<right && arr[left]==arr[left+1]) left++; //Skip duplicates 
                        while(left<right && arr[right]==arr[right-1]) right--; //Skip duplicates 
                        left++;
                        right--;
                    } else if(sum<target){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        System.out.println(list3);
    }
}

