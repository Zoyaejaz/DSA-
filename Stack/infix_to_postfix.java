import java.util.*;
public class infix_to_postfix {
    public static int priority(char op){
        if(op=='+'||op=='-') return 1;
        if(op=='*'||op=='/') return 2;
        if(op=='^') return 3;
        return -1;
    }
    public static String infixtopostfix(String s){
        StringBuilder ans=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
            ans.append(ch);
        }
        else if(ch=='('){
            st.push(ch);
        }
        else if(ch==')'){
            while(!st.isEmpty()&& st.peek()!='('){
                ans.append(st.pop());
            }
            if(!st.isEmpty()){
                st.pop();
            }
        }
        else{
            while(!st.isEmpty() && ((ch=='^' && priority(ch)<priority(st.peek())) || (ch != '^' && priority(ch) <= priority(st.peek() )))){
                ans.append(st.pop());
            }
            st.push(ch);
        }
        }
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s="a+b*(c^d-e)";
        String ans=infixtopostfix(s);
        System.out.println(ans);
    }
}
