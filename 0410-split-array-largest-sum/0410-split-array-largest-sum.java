class Solution {
    public int splitArray(int[] nums, int m) {
        int start =0 ;
        int end = 0;

        for(int i=0;i<nums.length;i++){
            start = Math.max(start , nums[i]);
            end += nums[i];
        }


        while(start < end){
            int mid  = start + (end-start)/2;
            //try for the middle as potential ans

            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for (int i : nums) {
                if(sum+i > mid){
                    //you cannot add this in this sub-array, make new one
                    //say you add this in new sub-array, then sum = i
                    sum = i;
                    pieces++;
                }
                else{
                    sum += i;
                }
            }

            if(pieces > m){
                //you made too many pieces, so you need to increase the mid
                //such that less pieces are made
                start = mid+1;
            }
            else{
                //you could have made more pieces, try to minimize the maximum sum
                end = mid;
            }

        }
        
        return start;
    }
}