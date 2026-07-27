import java.util.*;
public class infix_to_prefix {
    public static int priority(char op){
        if(op=='+'||op=='-') return 1;
        if(op=='*'||op=='/') return 2;
        if(op=='*') return 3;
        return -1;
    }
    public static String infixtoprefix(String s){
        StringBuilder reverse=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='('){
                reverse.append(')');
            }
            else if(ch==')'){
                reverse.append('(');
            } else{
                reverse.append(ch);
            }
        }
        StringBuilder post=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<reverse.length();i++){
            char ch=reverse.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                post.append(ch);
            }
            else if(ch=='('){
                st.push(ch);
            }
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    post.append(st.pop());
                }
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else{
                while(!st.isEmpty() && (ch=='^' && priority(ch)<=priority(st.peek())) || !st.isEmpty() && (ch=='^' && priority(ch)<priority(st.peek()))){
                    post.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            post.append(st.pop());
        }
        return post.reverse().toString();
    }
    public static void main(String[] args){
        String s="(A+B)*C-D+F";
        String ans=infixtoprefix(s);
        System.out.println(ans);

    }
}
