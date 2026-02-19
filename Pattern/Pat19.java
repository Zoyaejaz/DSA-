package Pattern;

public class Pat19 {
    public static void main(String[] args){
    int n=4;
    Character ch='E';
    for(int i=1;i<=n;i++){
        ch=Character.valueOf((char)(ch-(i-1)));
        for(int j=1;j<=i;j++){
            System.out.print(ch+" ");
            ch++;
        }
        ch--;
        System.out.println();
    }
    }
    
}
