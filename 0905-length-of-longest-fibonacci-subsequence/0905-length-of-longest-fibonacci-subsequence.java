import java.util.*;

class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        if (arr.length <= 2) return 0;

        int n = arr.length;
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(arr[i], i);
        }

        int maxi = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = arr[j];
                int b = arr[i];
                int len = 2;
                while (indexMap.containsKey(a + b)) {
                    len++;
                    maxi = Math.max(maxi, len);
                    int temp = a;
                    a = a + b;
                    b = temp;
                }
            }
        }

        return maxi > 2 ? maxi : 0;
    }
}