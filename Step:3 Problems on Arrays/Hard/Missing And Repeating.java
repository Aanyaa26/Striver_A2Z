Date: 16.11.24

ArrayList<Integer> ans = new ArrayList<>();
        
        long n = arr.length;
        
        // Calculate sum of numbers and sum of squares of numbers
        long sn = (n * (n + 1)) / 2; // Sum of first n natural numbers
        long s2n = (n * (n + 1) * (2 * n + 1)) / 6; // Sum of squares of first n natural numbers
        
        long s = 0, s2 = 0;
        
        // Calculate sum and sum of squares of the given array
        for (int i = 0; i < n; i++) {
            s += arr[i];
            s2 += (long) arr[i] * (long) arr[i];
        }
        
        // Form the equations to find the missing and repeated numbers
        long val1 = sn - s; // missing - repeated
        long val2 = s2n - s2; // square of missing - square of repeated
        val2 = val2 / val1; // val2 = missing + repeated
        
        long x = (val1 + val2) / 2; // missing number
        long y = x - val1; // repeated number
        
        ans.add((int) x); // Add missing number
        ans.add((int) y); // Add repeated number
        
        return ans;
    }
}
