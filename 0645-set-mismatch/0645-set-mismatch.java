class Solution {
    public int[] findErrorNums(int[] nums) {
    int[] ans = new int[2];
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
            ans[0] = nums[i];
            ans[1] = i+1;
       }
   }
   return ans;
}

   public void swap(int[] nums,int i, int j){
       int temp = nums[i];
       nums[i] = nums[j];
       nums[j]=temp;
   }
}