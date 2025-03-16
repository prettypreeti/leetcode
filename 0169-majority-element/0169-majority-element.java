class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        // for(int i=0; i<nums.length; i++){
        //     nums[n/2]

        // }
        return nums[n/2];
    }
}