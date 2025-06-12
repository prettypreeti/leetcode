class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = (low + high) / 2;

            // Ensure mid is even so it points to the first of the pair
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                // Unique element is after this pair
                low = mid + 2;
            } else {
                // Unique element is at mid or before
                high = mid;
            }
        }

        return nums[low];
    }
}