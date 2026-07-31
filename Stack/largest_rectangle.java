import java.util.*;
public class largest_rectangle {
    public static int histogram(int[] heights){
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int maxarea=0;
        for(int i=0;i<=n;i++){
            while(!st.isEmpty()&&(i==n || heights[st.peek()]>=heights[i])){
                int height=heights[st.pop()];
                int right=i;
                int left=st.isEmpty()?-1:st.peek();
                int width=right-left-1;
                maxarea=Math.max(maxarea,(width*height));
            }
            st.push(i);
        }
        return maxarea;
    }
    public static void main(String[] args) {
        int[] heights={2,1,5,6,2,3};
        int ans=histogram(heights);
        System.out.println(ans);

    }
}
