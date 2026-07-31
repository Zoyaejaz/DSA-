import java.util.Stack;

public class maximal_rectangle {
    public static int maximal(int[][] matrix){
        int n=matrix.length;
        int m=matrix[0].length;
        int[] heights=new int[m];
        int maxarea=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==1){
                    heights[j]++;
                }
                else{
                    heights[j]=0;
                }
            }
            int area=histogram(heights);
            maxarea=Math.max(area,maxarea);
        }
        return maxarea;
    }
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
        int[][] matrix={{1,0,1,0,1},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        int ans=maximal(matrix);
        System.out.println(ans);
    }
}
