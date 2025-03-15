class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        // int sum=0;
        //  for(int x:apple){
        //      sum+=x;   
        //  }
        //  return sum;
        int sum=Arrays.stream(apple).sum();
        Arrays.sort(capacity);
        int i= capacity.length-1, box=0;
        while(sum>0){
            sum-=capacity[i--];
            box++;
        }
        return box;
    }
}