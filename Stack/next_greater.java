import java.util.*;
public class next_greater {
    public static int[] nextg(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={2,1,5,3};
        int[] ans=nextg(arr);
        System.out.println(Arrays.toString(ans));
    }
}
