package String;

public class Rotate_string {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        return (s+s).contains(goal);
    }
    public static void main(String[] args){
        String s="abcde";
        String goal="cdeab";
        Rotate_string rs=new Rotate_string();
        System.out.println(rs.rotateString(s,goal));
    }
}
