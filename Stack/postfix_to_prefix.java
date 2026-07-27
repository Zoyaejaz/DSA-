import java.util.*;
public class postfix_to_prefix {
    public static String postfixtoprefix(String s){
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isWhitespace(ch)){
                continue;
            }
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String op2=st.pop();
                String op1=st.pop();
                String combined=ch+op1+op2;
                st.push(combined);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String s="AB-DE+F*/";
        String ans=postfixtoprefix(s);
        System.out.println(ans);
    }
}
