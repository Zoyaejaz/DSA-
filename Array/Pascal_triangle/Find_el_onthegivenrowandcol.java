package Pascal_triangle;

public class Find_el_onthegivenrowandcol {
    public static void main(String[] args){
        int rows=5;
        int cols=3;
        //brute force approach
        //Time complexity: O(rows), Space complexity: O(1)
        //we will use the formula nCr=n!/r!(n-r)!
        int res=1;
        for (int i=0;i<cols;i++){
            res=res*(rows-1);
            res=res/(i+1);
        }
        System.out.println(res);
    }
}
