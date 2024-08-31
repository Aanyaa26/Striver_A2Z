Date: 31.08.24

class Solution {
    public int binarysearch(int[] arr, int k) {
        int n = arr.length;
        int low =0;
        int high = n-1;
        
        
        while(low<=high){
            int mid = (low+high)/2;
            if(k==arr[mid]){
                return mid;
            }
            else if(k > arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}
