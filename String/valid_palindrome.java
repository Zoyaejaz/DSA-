package String;

public class valid_palindrome {
    public boolean isPalindrome(String s) {
        s=s.trim().toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]","");
        if(s.length()==0) return true;
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        valid_palindrome vp=new valid_palindrome();
        System.out.println(vp.isPalindrome(s));
    }
}
