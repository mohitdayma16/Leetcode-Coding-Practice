class Solution {
    public int[] searchRange(int[] arr, int k) {
        int ans[] = {-1, -1};
        ans[0] = findFirst(arr, k);
        ans[1] = findLast(arr, k);
        return ans;
    }

    private int findFirst(int[] arr, int k) {
        int left = 0, right = arr.length - 1, first = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == k) {
                first = mid;  // Found k, but keep searching left
                right = mid - 1;
            } else if (arr[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    private int findLast(int[] arr, int k) {
        int left = 0, right = arr.length - 1, last = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == k) {
                last = mid;  // Found k, but keep searching right
                left = mid + 1;
            } else if (arr[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }
}
