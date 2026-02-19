package Pattern;
import java.util.*;

public class Pat15 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Character ch='A';
        for(int i=1;i<=n;i++){
            ch='A';
            for(int j=n;j>=i;j--){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
