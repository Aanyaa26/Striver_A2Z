Date: 8.10.24

// class Solution {
//     public void sortColors(int[] nums) {
//         for(int i =0; i<nums.length;i++){
//             int min =i;
//             for(int j =i+1; j<nums.length;j++){
//                 if(nums[j]<nums[min]){
//                     min =j;
//                 }
                
//             }
//             int temp = nums[min];
//                 nums[min]=nums[i];
//                 nums[i]=temp;
//         }
        
//     }
// }

class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int curr = 0;
        int right = nums.length - 1;

        while (curr <= right) {
            if (nums[curr] == 0) {
                swap(nums, left, curr);
                left++;
                curr++;
            } else if (nums[curr] == 1) {
                curr++;
            } else {
                swap(nums, curr, right);
                right--;
            }
        }
    }

    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
