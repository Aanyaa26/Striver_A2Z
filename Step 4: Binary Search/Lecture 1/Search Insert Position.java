Date: 31.08.24

class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low<= high){
           int mid = (low+high)/2;
            if (target ==nums[mid]){
                return mid;
            }
            else if( nums[mid]< target){
                low = mid +1;
            }
            else{
                high = mid-1;
            }
            
        }
        return low;
    }
}
