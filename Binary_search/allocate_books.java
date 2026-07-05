package Binary_search;
public class allocate_books {

    // Helper function to check if a allocation is feasible for a max capacity 'mid'
    private static boolean isFeasible(int[] books, int M, int maxPagesAllowed) {
        int studentCount = 1;
        int currentPagesSum = 0;

        for (int pages : books) {
            // If a single book has more pages than the allowed limit, it's impossible
            if (pages > maxPagesAllowed) {
                return false;
            }

            if (currentPagesSum + pages > maxPagesAllowed) {
                // Allocate to the next student
                studentCount++;
                currentPagesSum = pages;

                // If students required exceed the available students, return false
                if (studentCount > M) {
                    return false;
                }
            } else {
                currentPagesSum += pages;
            }
        }
        return true;
    }

    public static int allocateBooks(int[] books, int M) {
        int N = books.length;
        
        // If books are fewer than students, allocation is impossible
        if (N < M) {
            return -1; 
        }

        int low = 0;
        int high = 0;

        for (int pages : books) {
            low = Math.max(low, pages); // Max element
            high += pages;              // Sum of all elements
        }

        int result = -1;

        // Binary Search range
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isFeasible(books, M, mid)) {
                result = mid;       // 'mid' is a potential solution
                high = mid - 1;     // Try to find a smaller maximum
            } else {
                low = mid + 1;      // Increase the limit
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] books = {25,46,28,49,24};
        int students = 4;

        int minMaxPages = allocateBooks(books, students);
        System.out.println("The minimum possible value of the maximum pages is: " + minMaxPages);
        // Output: 113 (Student 1 gets 12+34+67 = 113, Student 2 gets 90)
    }
}
