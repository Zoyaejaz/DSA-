import java.util.Stack;

public class postfix_to_infix {
    public static String postfixtoinfix(String s){
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
                String combine="("+op1+ch+op2+")";
                st.push(combine);
            }
        }
        return st.peek();
    }
    public static void main(String[] args) {
        String s="AB-DE+F*/";
        String  ans=postfixtoinfix(s);
        System.out.println(ans);
    }
}
