class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int ans1 = kadane(nums);
        int ans2 = kadanemin(nums);

        if(sum == ans2){
            return ans1;
        }
        return Math.max(ans1, sum-ans2);
    }
    public int kadane(int[] nums){
            int ans = Integer.MIN_VALUE;
            int sum = 0;

            for(int x : nums){
                sum += x;
                ans = Math.max(sum, ans);

                if(sum < 0){
                    sum = 0;
                }
            }
            return ans;
        }

        public int kadanemin(int[] nums){
            int ans = Integer.MAX_VALUE;
            int sum = 0;
            for(int x : nums){
                sum += x;
                ans = Math.min(ans, sum);
                if(sum > 0){
                    sum =0;
                }
            }
            return ans;
    }
}