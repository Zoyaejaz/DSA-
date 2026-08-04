package String;

public class largest_oddnum_string {
    public static String largest(String num){
        for(int i=num.length()-1;i>=0;i--){
            char c=num.charAt(i);
            if((c-'0')%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args){
        String num="52";
        String result=largest(num);
        System.out.println("The largest odd number from the string is: "+result);
    }
}
