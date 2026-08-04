package String;

public class char_freq {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        String s="hello";
        int count=0;
        char c='l';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
        }
        }
        System.out.println(count);
    }
}
