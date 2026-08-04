package String;

public class convert_touppercase_withoutmethod {
    public static void main(String[] args){
        String word="hello";
        StringBuilder st=new StringBuilder();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='a' && word.charAt(i)<='z'){
                st.append((char)(word.charAt(i)-32));
            }
        }
        System.out.println(st.toString());
    }
}
