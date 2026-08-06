package String;

public class count_digits_inastring {
    public static int count(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String str = "abc123def456";
        System.out.println(count(str)); // Output: 6
    }
}
