package String;

public class Length_of_Last_word {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String[] arr=s.split("\\s+");
        String st=arr[arr.length-1];
        return st.length();
    }
    public static void main(String[] args){
        String s="   fly me   to   the moon  ";
        Length_of_Last_word lw=new Length_of_Last_word();
        System.out.println(lw.lengthOfLastWord(s));
    }
}
