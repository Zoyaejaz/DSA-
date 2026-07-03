import java.util.*;
public class Merge_Overlapping {
    public static void main(String[] args){
        int[][] interval={{1,3},{2,6},{8,9},{9,11},{8,10},{15,18},{16,17}};
        int n=interval.length;
        //Brute force approach
        //Time complexity: O(n^2+nlogn)=O(n^2), Space complexity: O(n)
        Arrays.sort(interval, (a, b) -> Integer.compare(a[0], b[0]));

        if (n == 0) {
            return;
        }

        List<int[]> list = new ArrayList<>();

        int currentStart = interval[0][0];
        int currentEnd = interval[0][1];

        for (int i = 1; i < n; i++) {
            int start = interval[i][0];
            int end = interval[i][1];

            if (start <= currentEnd) {
                currentEnd = Math.max(currentEnd, end);
            } else {
                list.add(new int[] { currentStart, currentEnd });
                currentStart = start;
                currentEnd = end;
            }
        }

        list.add(new int[] { currentStart, currentEnd });

        for (int[] arr : list) {
            System.out.println(Arrays.toString(arr));
        }
        // Optimal approach
        // Time complexity: O(n+nlogn)=O(nlogn), Space complexity: O(n)
        List<int[]> list1 = new ArrayList<>();
         Arrays.sort(interval, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i=0;i<n;i++){
            if(list1.isEmpty() || list1.get(list1.size() - 1)[1] < interval[i][0]){
                list1.add(interval[i]);
            }
            else{
                list1.get(list1.size() - 1)[1] = Math.max(list1.get(list1.size() - 1)[1], interval[i][1]);
            }
        }
        for (int[] arr : list1) {
            System.out.println(Arrays.toString(arr));
        }

    }
}
