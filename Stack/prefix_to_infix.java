import java.util.*;
public class prefix_to_infix {
    public static String prefixtoinfix(String s){
        Stack<String> st=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(Character.isWhitespace(ch)){
                continue;
            }
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String op1=st.pop();
                String op2=st.pop();
                String combined="("+op1+ch+op2+")";
                st.push(combined);
            }
        }
        return st.peek();
    }
    public static void main(String[] args){
        String s="*+PQ-MN";
        String ans=prefixtoinfix(s);
        System.out.println(ans);
    }
}
