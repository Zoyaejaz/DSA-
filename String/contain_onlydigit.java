package String;

public class contain_onlydigit {
    public static void main(String[] args){
        String s="hello123";
        boolean has=true;
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))){
                has=false;
                break;
            }
        }
        System.out.println("The string contains only digit: "+has);
    }
}
