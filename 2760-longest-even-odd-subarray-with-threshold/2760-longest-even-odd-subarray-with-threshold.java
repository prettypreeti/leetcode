class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int ans=0,n=nums.length;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0 && nums[i]<=threshold){
                int j=i+1;
                while(j<n &&nums[j]<=threshold && nums[j]%2!=nums[j-1]%2){
                    j++;
                }
                ans=Math.max(ans, j-i);
                i=j-1;
            }
           
        }
         return ans;
        
        
    }
}