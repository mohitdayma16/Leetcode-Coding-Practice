class Solution {
    public int findDuplicate(int[] nums) {
        
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
                return nums[i];
            }
        }
        return 0;
    }
    public void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]=temp;
    }
}