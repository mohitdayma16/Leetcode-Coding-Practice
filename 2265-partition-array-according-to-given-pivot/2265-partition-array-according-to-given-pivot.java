class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length];
        int left = 0, mid = 0, right = nums.length - 1;

        for (int num : nums) {
            if (num < pivot) {
                result[left++] = num;
            }
        }

        mid = left;
        for (int num : nums) {
            if (num == pivot) {
                result[mid++] = num;
            }
        }

        for (int num : nums) {
            if (num > pivot) {
                result[mid++] = num;
            }
        }

        return result;
    }
}
