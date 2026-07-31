import java.util.Stack;

public class remove_k_digits {
    public static String removeKdigits(String nums, int k) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<nums.length();i++){
            while(!st.isEmpty()&& k>0 && st.peek()>nums.charAt(i)){
                st.pop();
                k--;
            }
            st.push(nums.charAt(i));
        }
        while(k>0){
                st.pop();
                k--;
            }
        String ans="";
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        StringBuilder sb = new StringBuilder(ans);
        ans = sb.reverse().toString();
        int i = 0;
        while (i < ans.length() && ans.charAt(i) == '0') {
            i++;
}
        ans = ans.substring(i);
        if(ans.equals("")) return "0";
        return ans;
    }
    public static void main(String[] args) {
        String num="1432219";
        int k=3;
        String ans=removeKdigits(num,k);
        System.out.println(ans);
    }
}
