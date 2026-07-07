package Binary_search;

public class Capacity_ship {
    public int capacity(int[] weights,int capacity){
        int days=1;
        int load=0;
        for(int i=0;i<weights.length-1;i++){
            if(load+weights[i]>capacity){
                days=days+1;
                load=weights[i];
            }
            else{
                load +=weights[i];
            }
        }

    }
}
