class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> m = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){ 
                swap(nums, i, correct);   
            }
            else{
                i++;
            }
        }

        for(i=0;i<nums.length;i++){
            if(nums[i]!= i+1){
                m.add(i+1);
            }
        }
        return m;
    }
    public void swap(int[] arr, int i, int j) { 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    }
}