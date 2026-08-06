package String;
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
