package String;

import java.util.Stack;

public class Reverse_chararray {
    public void reverseString(char[] s) {
       Stack<Character> st=new Stack<>();
       for (char  ch:s){
        st.push(ch);
       }
       int i=0;
       while(!st.isEmpty()){
        s[i]=st.pop();
        i++;
       }
    }
    public static void main(String[] args){
        char[] s={'h','e','l','l','o'};
        Reverse_chararray rc=new Reverse_chararray();
        rc.reverseString(s);
        System.out.println(s);
    }
}
