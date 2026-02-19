package Pattern;
import java.util.*;
public class Pat18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            Character ch='A';
            int b=(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch+" ");
                if(j<=b){
                    ch++;
                }
                else{
                    ch--;
                }
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
