Date: 16.11.24

class Solution {
    // Merges two sorted halves of the array and counts reverse pairs
    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        // Merging elements in a sorted manner while counting reverse pairs
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // Add remaining elements from the left half if any
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // Add remaining elements from the right half if any
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Transfer elements back from temporary array to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    // Counts the number of reverse pairs in the array
    public static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        
        // Count reverse pairs during merge process
        for (int i = low; i <= mid; i++) {
            // Use long for the multiplication to prevent overflow
            while (right <= high && (long) arr[i] > 2 * (long) arr[right]) {
                right++;
            }
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    // Merge sort and count reverse pairs
    public static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2;
        
        // Count reverse pairs in the left half
        cnt += mergeSort(arr, low, mid); 
        
        // Count reverse pairs in the right half
        cnt += mergeSort(arr, mid + 1, high); 
        
        // Count reverse pairs across the two halves
        cnt += countPairs(arr, low, mid, high);
        
        // Merge the two halves while maintaining sorted order
        merge(arr, low, mid, high);
        
        return cnt;
    }

    // Function to return the total number of reverse pairs in the array
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}
