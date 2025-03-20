import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static int[] findMaximum(int[] arr, int k) {

        int n = arr.length;
        int[] maximumInWindows = new int[n - k + 1];
        Deque<Integer> queue = new ArrayDeque<>();

        for (int j = 0; j < n; j++) {
            // Remove elements that are out of this window
            while (!queue.isEmpty() && queue.peek() < j - k + 1) {
                queue.poll();
            }

            while (!queue.isEmpty() && arr[queue.peekLast()] < arr[j]) {
                queue.pollLast();
            }

            queue.offer(j);

            // Store the max value
            if (j >= k - 1) {
                maximumInWindows[j - k + 1] = arr[queue.peek()];
            }
        }
        return maximumInWindows;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] ans = findMaximum(arr, k);
        System.out.println(Arrays.toString(ans));
    }
}
