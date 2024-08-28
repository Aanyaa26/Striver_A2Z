//VERY VERY IMPORTANT AND TOUGH QUESTION BOTH GFG & LEETCODE - MEDIUM QUESTION

class Solution {
    // Function for finding the length of the longest subarray with sum equal to K
    public static int lenOfLongSubarr(int[] a, int N, int K) {
        // HashMap to store (cumulative sum, index)
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0; // Initialize cumulative sum
        int maxlen = 0; // Initialize maximum length
        
        for (int i = 0; i < N; i++) {
            sum += a[i]; // Add the current element to the cumulative sum
            
            // Check if the cumulative sum itself is equal to K
            if (sum == K) {
                maxlen = i + 1;
            }
            
            // If (sum - K) is found in the map, we have a subarray with sum K
            if (map.containsKey(sum - K)) {
                maxlen = Math.max(maxlen, i - map.get(sum - K));
            }
            
            // Store the first occurrence of the cumulative sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        
        return maxlen;
    }
}
