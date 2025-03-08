class Solution {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int multi=1;
        int n=nums.length;
        for(int i=0; i<n; i++){
            multi*=nums[i];
            ans=Math.max(multi,ans);
            if(multi==0)multi=1;
        }
        multi=1;
        for(int i=n-1;i>=0;i--){
            multi*=nums[i];
            ans=Math.max(multi,ans);
            if(multi==0)multi=1;
        }
        return ans;
        
            
        
    }
}