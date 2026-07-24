import java.util.*;
public class balanced_paranthesis {
    public static boolean balance(String s){
        Stack<Character> st=new Stack<>();
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else if(!st.isEmpty()){
                if(s.charAt(i)==')' && st.peek()=='('){
                    st.pop();
                }
                else if(s.charAt(i)==']' && st.peek()=='['){
                    st.pop();
                }
                else if(s.charAt(i)=='}' && st.peek()=='{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s="()[{}()]";
        boolean ans=balance(s);
        System.out.println(ans);
    }
}
