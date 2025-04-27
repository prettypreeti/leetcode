class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int red = 0, white = 0, blue = n-1;

        while( white <= blue){
            if(nums[white] == 0){
                int temp = nums[white];
                nums[white] = nums[red];
                nums[red] = temp; 
                red++;
                white++;
            }
            else if(nums[white] == 1){
                white++;
            }
            else{
                int temp = nums[white];
                nums[white] = nums[blue];
                nums[blue] = temp;
                blue--;
            }
        }
        
    }
}