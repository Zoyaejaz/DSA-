package String;

public class Reverse_string {
    public static void main(String[] args){
        String s="hello";
        StringBuilder st=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            st.append(s.charAt(i));
        }
        System.out.println(st.toString());
    }
}
