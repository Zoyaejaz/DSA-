import java.util.*;

public class Merge_Overlapping_Subintervals {
    public static int[][] merge(int[][] intervals){
        //Brute force
        //Time complexity: O(n^2) | Space complexity: O(n)
        int n=intervals.length;
        if(n<=1) return intervals;
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            int start =intervals[i][0];
            int end=intervals[i][1];
            if(!ans.isEmpty() && ans.get(ans.size()-1)[1]>=start){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(intervals[j][0]<=end){
                    end=Math.max(end,intervals[j][1]);
                }
                else{
                    break;
                }
            }
            ans.add(new int[]{start,end});
        }
        return ans.toArray(new int[ans.size()][]);

    }

    //Optimal solution
    //Time complexity: O(nlogn) | Space complexity: O(n)
    public static int[][] mergeOptimal(int[][] intervals){
        int n=intervals.length;
        if(n<=1) return intervals;
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> ans=new ArrayList<>();
        int[] currentInterval=intervals[0];
        ans.add(currentInterval);
        for(int i=1;i<n;i++){
            if(currentInterval[1]>=intervals[i][0]){
                currentInterval[1]=Math.max(currentInterval[1],intervals[i][1]);
            }
            else{
                currentInterval=intervals[i];
                ans.add(currentInterval);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main(String[] args){
        int[][] interval={{1,3},{2,6},{8,10},{15,18}};
        int[][] ans=mergeOptimal(interval);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i][0]+" "+ans[i][1]);
        }
    }
}