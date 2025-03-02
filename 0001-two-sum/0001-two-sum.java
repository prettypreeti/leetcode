class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result= new int[2];
        int number1=0;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            number1=nums[i];
            for(int j=i+1; j<nums.length; j++){
                sum=number1+nums[j];
                if(sum==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
        
    }
}