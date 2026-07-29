import java.util.Stack;

public class reverse_string {
    public static void reverse(char[] s){
        Stack<Character> st=new Stack<>();
        for(char c:s){
            st.push(c);
        }
        int i=0;
        while(!st.isEmpty()){
            s[i]=st.pop();
            i++;
        }
    }
    public static void main(String[] args){
        char s[]={'h','e','l','l','o'};
       reverse(s);
       System.out.println(s);


    }
}
