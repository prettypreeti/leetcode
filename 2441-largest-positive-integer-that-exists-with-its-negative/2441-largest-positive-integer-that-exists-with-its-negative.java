class Solution {
    public int findMaxK(int[] nums) {
        // two pointer method
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
     while(i<j){
        if(nums[i]*-1== nums[j] )return nums[j];
        else if(nums[i]*-1>nums[j])i++;
        else j--;
     }
     return -1;

        
    }
}