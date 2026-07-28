import java.util.ArrayDeque;
import java.util.Deque;

public class sum_subarray_minimum {
    public static int sum(int[] arr){
        int n=arr.length;
        long mod=1_000_000_007;
        int[] left=new int[n];
        int[] right=new int[n];
        Deque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            left[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }
        st.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            right[i] = st.isEmpty() ? n - i : st.peek() - i;
            st.push(i);
        }
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            long count = (long) left[i] * right[i];
            totalSum = (totalSum + (count * arr[i]) % mod) % mod;
        }

        return (int) totalSum;
    }
    public static void main(String[] args) {
        int[] arr={3,1,2,4};
        int ans=sum(arr);
        System.out.println(ans);
    }
}
