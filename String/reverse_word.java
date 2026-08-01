package String;

public class reverse_word {
    public String reverseWords(String s) {
        String str=s.trim();
        String[] arr=str.split("\\s+");
        StringBuffer ans=new StringBuffer();
        for(int i=arr.length-1;i>0;i--){
                ans.append(arr[i]+" ");
        }
        return ans.toString()+arr[0];

    }
    public static void main(String[] args){
        String s="  hello world  ";
        reverse_word rw=new reverse_word();
        System.out.println(rw.reverseWords(s));
    }
}
