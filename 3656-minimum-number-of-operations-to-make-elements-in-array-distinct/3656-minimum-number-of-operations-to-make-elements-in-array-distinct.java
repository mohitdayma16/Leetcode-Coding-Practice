class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;
        int start = 0;

        while (start < nums.length) {
            Set<Integer> s = new HashSet<>();
            boolean duplicateFound = false;

            for (int i = start; i < nums.length; i++) {
                if  (s.contains(nums[i])) {
                    operations++;
                    start += 3; 
                    duplicateFound = true;
                    break;
                }
             s.add(nums[i]);
            }

            if (!duplicateFound) {
                break;
            }
        }

        return operations;
    }
}