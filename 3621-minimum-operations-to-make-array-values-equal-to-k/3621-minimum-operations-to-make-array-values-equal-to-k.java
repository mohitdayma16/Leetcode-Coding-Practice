class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        int count=0;
        for(int i:nums){
            if(i>k){
                s.add(i);
            }
            if(i<k){
                return -1;
            }
        }
        return s.size();
    }
}