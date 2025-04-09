class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        int count=0;
        for(int i:nums){
            s.add(i);
        }
        for(int i:s){
            if(i<k){
                return -1;
            }
            if(i>k){
                count++;
            }
        }
        return count;
    }
}