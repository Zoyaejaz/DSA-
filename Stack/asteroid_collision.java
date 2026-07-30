import java.util.*;
public class asteroid_collision {
    public static int[] collide(int[] arr){
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                st.push(arr[i]);
            }
            else{
                while(!st.isEmpty()&&st.peek()>0&&st.peek()<Math.abs(arr[i])){
                    st.pop();
                }
                if(st.peek()==Math.abs(arr[i])){
                    st.pop();
                }
                if(st.isEmpty()||st.peek()<0){
                    st.push(arr[i]);
                }
            }
        }
        int[] ans=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] asteroid={5,10,-5};
        int[] ans=collide(asteroid);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        
    }
}
