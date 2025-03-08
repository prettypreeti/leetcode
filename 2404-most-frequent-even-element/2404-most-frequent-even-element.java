class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] hash=new int[100001];
        for(int x:nums)hash[x]++;
        int ans=-1,maxFreq=0;
        for(int i=0; i<100001; i+=2){
            if(hash[i]>maxFreq){
                ans=i;
                maxFreq=hash[i];
            }
        }
        return ans;
        
    }
}