package String;

public class remove_outermost_bracket {
    public static String remove(String s){
        StringBuilder ans=new StringBuilder();
        int depth=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(depth>0){
                    ans.append('(');
                }
                depth++;
            } else{
                depth--;
                if(depth>0){
                    ans.append(')');
                }
            }
        }
        return ans.toString();
    }
    public static void main(String[] args){
        String s="(()())(())";
        System.out.println(remove(s));
    }
}
