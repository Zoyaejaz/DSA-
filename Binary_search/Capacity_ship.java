package Binary_search;

public class Capacity_ship {
    public int capacity(int[] weights, int capacity) {
        int days = 1;
        int load = 0;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > capacity) {
                days++;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }

    public int max(int[] weights) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > max) {
                max = weights[i];
            }
        }
        return max;
    }

    public int sum(int[] weights) {
        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
        }
        return sum;
    }

    public int mincapacity(int[] weights, int days) {
        for (int capacity = max(weights); capacity <= sum(weights); capacity++) {
            int daysReq = capacity(weights, capacity);
            if (daysReq <= days) {
                return capacity;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days = 5;
        Capacity_ship obj = new Capacity_ship();
        int ans = obj.mincapacity(weights, days);
        System.out.println(ans);
    }
}
