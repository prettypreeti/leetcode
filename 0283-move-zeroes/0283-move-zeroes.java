class Solution {
    public void moveZeroes(int[] nums) {
        // two pointer
        // i is traversing 0-n
        // i is atnon zero element

        for(int i=0,j=0; i<nums.length; i++){
            if(nums[i]!=0){
                // swap ith and jth element
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;   
                // move j to next eleement
            }
        }
        
    }
}