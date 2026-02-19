package Pattern;

public class Pat7 {
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=8-(2*i);j++){    //(n-1)*2=(5-1)*2=8
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
