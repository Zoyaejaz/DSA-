package DP;

public class BuySellstock {
    public static void main(String[] args) {
        int stock[]={7,1,5,3,6,4};
        int n=stock.length;
        //Optimal approach: T.C=O(n), S.C=O(1)
        int minPrice=stock[0];
        int maxProfit=0;
        for(int i=1;i<n;i++){
            int cost=stock[i]-minPrice;
            maxProfit=Math.max(maxProfit,cost);
            minPrice=Math.min(minPrice,stock[i]);
        }
        System.out.println(maxProfit);
    }
}
