class Solution {
    public int findShortestSubArray(int[] nums) {
            Map<Integer, Integer> start = new HashMap(),
            end = new HashMap(), count = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(count.containsKey(num)){
                count.put(num, count.get(num)+1);
            }else{
                count.put(num, 1);
                start.put(num, i);
            }
            end.put(num, i);
        }

        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x: count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, end.get(x) - start.get(x) + 1);
            }
        }
        return ans;
        
    }
}