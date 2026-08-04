package String;

public class count_consonant {
    public static void main(String[] args){
        String s="apple";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
            continue;
        }
        else{
            count++;
        }
        }
        
        System.out.println("The count of consonants in the string is: "+count);
    }
}
