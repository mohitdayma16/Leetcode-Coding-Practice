class Solution {
    public int search(int[] nums, int target) {
        int pivot = pivot(nums);

        if(pivot == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }
        else{
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
    }
    int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;

            //this is for case 1:
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            //this is for case 2:
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }

            //this is for case 3:
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    int binarySearch(int[] arr, int target,int start,int end){
        
        while (start <= end) {
            int mid = start + (end - start) / 2; 
 
            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                start = mid + 1; 
            } else {
                end = mid - 1; 
            }
        }

        return -1;
    }
}