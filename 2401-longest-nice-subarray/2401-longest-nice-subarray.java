class Solution {
    public int longestNiceSubarray(int[] nums) {
          int ans  =0;
        int count = 0;
        int i = 0;

        for(int j=0; j<nums.length; j++){
            while((count & nums[j]) > 0){
                count ^= nums[i];
                i++;
            }
            count |= nums[j];    
            ans = Math.max(ans, j-i + 1);
        }
        return ans;
        
    }
}