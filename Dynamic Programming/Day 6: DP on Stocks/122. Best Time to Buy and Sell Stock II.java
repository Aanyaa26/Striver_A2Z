Date: 21.11.24

// optimised
class Solution {
    public int maxProfit(int[] prices) {
      int start = prices[0];
      int maxProf =0;
      for(int i =1;i<prices.length;i++){
   if(start<prices[i]) maxProf +=prices[i]-start;
        start=prices[i];
      }
    return maxProf;
    }
}

using dp - memoization 

class Solution {
    public int f(int ind, int buy, int[] prices, int n, int[][] dp) {
        // Base case
        if (ind == n) {
            return 0; // No profit possible when index exceeds bounds
        }

        // Check if already computed
        if (dp[ind][buy] != -1) {
            return dp[ind][buy];
        }

        int profit = 0;

        if (buy == 1) {
            // Either buy at this index or skip
            profit = Math.max(-prices[ind] + f(ind + 1, 0, prices, n, dp),
                              f(ind + 1, 1, prices, n, dp));
        } else {
            // Either sell at this index or skip
            profit = Math.max(prices[ind] + f(ind + 1, 1, prices, n, dp),
                              f(ind + 1, 0, prices, n, dp));
        }

        // Store the result in the DP array and return it
        return dp[ind][buy] = profit;
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;

        // Memoization table: ind x buy
        int[][] dp = new int[n][2];
        for (int[] row : dp) {
            Arrays.fill(row, -1); // Initialize with -1 (uncomputed state)
        }

        return f(0, 1, prices, n, dp); // Start from index 0 with ability to buy
    }
}
