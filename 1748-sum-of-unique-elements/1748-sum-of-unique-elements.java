class Solution {
    public int sumOfUnique(int[] nums) {
        int[] hash=new int[101];
        for(int x:nums)hash[x]++;
        int ans=0;
        for(int i=0; i<101; i++){
            if(hash[i]==1)ans+=i;
        }
        return ans;
        
    }
}