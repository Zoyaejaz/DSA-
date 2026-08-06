package String;
import java.util.Arrays;
public class valid_anagram {
    public static boolean isana(String s,String t){
        if(s.length()!=t.length()) return false;
        int[] charcount=new int[26];
        for(int i=0;i<s.length();i++){
            charcount[s.charAt(i)-'a']++;
            charcount[t.charAt(i)-'a']--;
        }
        for (int count:charcount){
            if(count!=0){
                return false;
            }
        }
        return true;
    }

    //or we can use sorting method to check if two strings are anagrams of each other
    public static boolean isana_sort(String s,String t){
        if(s.length()!=t.length()) return false;
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
}

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isana(s, t)); // Output: true
        System.out.println(isana_sort(s, t)); // Output: true
    }
}
