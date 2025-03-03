class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int n = nums.length;
        
        // Compute the sum of the first 'k' elements
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        // Initialize maxSum as the sum of the first window
        int maxSum = sum;

        // Slide the window across the array
        for (int i = k; i < n; i++) {
            sum += nums[i];      // Add new element entering window
            sum -= nums[i - k];  // Remove element leaving window
            maxSum = Math.max(maxSum, sum); // Update maxSum
        }
        
        // Return maximum average
        return (double) maxSum / k;
    }  }
    