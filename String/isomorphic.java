package String;
import java.util.*;
public class isomorphic {
    public boolean isIsomorphic(String s, String t) {
        int[] m1=new int[256];
        int[] m2=new int[256];
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            if(m1[ch1]!=m2[ch2]){
                return false;
            }
             m1[ch1]=i+1;
             m2[ch2]=i+1;
        }
        return true;
}
//or use this approach 
public static boolean hash(String s,String t){
    HashMap<Character,Character> m1=new HashMap<>();
        HashMap<Character,Character> m2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(m1.containsKey(ch1)){
                if(m1.get(ch1)!=ch2){
                    return false;
                }
            }
            if(m2.containsKey(ch2)){
                if(m2.get(ch2)!=ch1){
                    return false;
                }
            }
            m1.put(ch1,ch2);
            m2.put(ch2,ch1);
        }
        return true;
}
public static void main(String[] args) {
        isomorphic obj = new isomorphic();
        String s = "egg";
        String t = "add";
        System.out.println(obj.isIsomorphic(s, t)); // Output: true

        s = "foo";
        t = "bar";
        System.out.println(obj.isIsomorphic(s, t)); // Output: false

        s = "paper";
        t = "title";
        System.out.println(obj.isIsomorphic(s, t)); // Output: true
    }
}
