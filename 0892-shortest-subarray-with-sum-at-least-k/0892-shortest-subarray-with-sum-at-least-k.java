import java.util.*;

class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        // Initialize prefix sum array
        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        // Deque to store indices of prefix sums
        Deque<Integer> deque = new LinkedList<>();
        int minLength = n + 1;

        for (int i = 0; i < prefixSum.length; i++) {
            // Remove indices from the front of the deque if they form a valid subarray
            while (!deque.isEmpty() && prefixSum[i] - prefixSum[deque.peekFirst()] >= k) {
                minLength = Math.min(minLength, i - deque.pollFirst());
            }

            // Maintain deque to be increasing
            while (!deque.isEmpty() && prefixSum[i] <= prefixSum[deque.peekLast()]) {
                deque.pollLast();
            }

            // Add current index to the deque
            deque.offerLast(i);
        }

        // Return result
        return minLength == n + 1 ? -1 : minLength;
    }
}
