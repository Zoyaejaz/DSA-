import java.util.*;
public class nearest_smallest {
    public static int[] smallest(int[] arr){
        //T.C=O(2N) S.C=O(2N)
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.isEmpty()?-1:st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={4,5,2,10,8};
        int[] ans=smallest(arr);
        System.out.println(Arrays.toString(ans));
    }
}
